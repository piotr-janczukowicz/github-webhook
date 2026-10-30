package io.github.piotr_janczukowicz.github.webhook;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.HexFormat;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Checks that a webhook delivery really comes from GitHub, using the {@code X-Hub-Signature-256} header.
 *
 * <p>GitHub signs the raw request body with the webhook secret (HMAC-SHA256) and sends {@code sha256=<hex>}. Verify
 * with the body exactly as received, before any parsing or re-serialization, because a single changed byte changes the
 * signature. The comparison takes the same time whatever the input, so it does not leak how much of a forged signature
 * was right.
 *
 * <p>A verifier holds one webhook secret: the key is prepared once, and each call only runs the HMAC. Build it once,
 * for example at start-up, and share it between threads; it is thread-safe and keeps no per-thread state.
 *
 * <p>Thread safety: the verifier keeps one keyed {@link Mac} as a prototype that is never used to compute anything.
 * After {@code init} it is not mutated, and each call only {@code clone()}s it, which reads it, and runs the HMAC on
 * the private copy. A provider whose {@code Mac} cannot be cloned is detected once, when the verifier is built; every
 * call then gets a fresh, freshly keyed {@code Mac} instead.
 *
 * <pre>{@code
 * GitHubWebhookVerifier verifier = GitHubWebhookVerifier.of(secret);
 * byte[] body = request.readBody();
 * String header = request.header("X-Hub-Signature-256");
 * if (!verifier.isValid(body, header)) {
 *     // answer 401 and do not process the delivery
 * }
 * }</pre>
 *
 * <p>The legacy SHA-1 header {@code X-Hub-Signature} is not supported. Use a long random secret: a webhook without a
 * secret cannot be verified at all.
 */
public final class GitHubWebhookVerifier {

    private static final Logger LOG = LoggerFactory.getLogger(GitHubWebhookVerifier.class);
    private static final String SECRET = "secret";
    private static final String PREFIX = "sha256=";
    private static final String HMAC = "HmacSHA256";
    private static final HexFormat HEX = HexFormat.of();

    private final SecretKeySpec key;
    private final String algorithm;
    // Keyed once and never used for update/doFinal, so it is never mutated after init and clone() only reads it.
    // Null when the provider's Mac cannot be cloned.
    private final @Nullable Mac prototype;

    private GitHubWebhookVerifier(final SecretKeySpec key, final String algorithm, final @Nullable Mac prototype) {
        this.key = key;
        this.algorithm = algorithm;
        this.prototype = prototype;
    }

    /**
     * Verifier for deliveries signed with {@code secret}.
     *
     * @param secret the webhook secret
     * @return verifier, safe to share between threads
     * @throws NullPointerException if {@code secret} is {@code null}
     * @throws IllegalArgumentException if {@code secret} is empty
     * @throws IllegalStateException if this JVM cannot compute HMAC-SHA256
     */
    public static GitHubWebhookVerifier of(final String secret) {
        requireNonNull(secret, SECRET);
        return withAlgorithm(secret.getBytes(StandardCharsets.UTF_8), HMAC);
    }

    /**
     * Verifier for deliveries signed with {@code secret}, for a secret that is held as bytes. The array is copied.
     *
     * @param secret the webhook secret
     * @return verifier, safe to share between threads
     * @throws NullPointerException if {@code secret} is {@code null}
     * @throws IllegalArgumentException if {@code secret} is empty
     * @throws IllegalStateException if this JVM cannot compute HMAC-SHA256
     */
    public static GitHubWebhookVerifier of(final byte[] secret) {
        return withAlgorithm(requireNonNull(secret, SECRET), HMAC);
    }

    /**
     * Whether {@code signatureHeader} is the signature of {@code payload}.
     *
     * @param payload raw request body, exactly as received
     * @param signatureHeader value of the {@code X-Hub-Signature-256} header, or {@code null} when it is missing
     * @return {@code true} only for a well-formed {@code sha256=<hex>} header that matches; {@code false} for a
     *     missing, malformed or wrong signature
     * @throws NullPointerException if {@code payload} is {@code null}
     */
    public boolean isValid(final byte[] payload, final @Nullable String signatureHeader) {
        requireNonNull(payload, "payload");
        if (signatureHeader == null || !signatureHeader.startsWith(PREFIX)) {
            logRejected(signatureHeader == null ? "the header is missing" : "the header does not start with sha256=");
            return false;
        }
        final byte[] provided;
        try {
            provided = HEX.parseHex(signatureHeader.substring(PREFIX.length()));
        } catch (final IllegalArgumentException malformed) {
            logRejected("the signature is not valid hex");
            return false;
        }
        final boolean isValid = MessageDigest.isEqual(hmac(payload), provided);
        if (!isValid) {
            logRejected("the signature does not match the " + payload.length
                    + " byte payload (wrong secret, or the body" + " was changed before it was verified)");
        }
        return isValid;
    }

    /**
     * The header value GitHub would send for {@code payload}: {@code sha256=<lowercase hex>}. Useful to test a webhook
     * receiver.
     *
     * @param payload request body
     * @return signature header value
     * @throws NullPointerException if {@code payload} is {@code null}
     */
    public String sign(final byte[] payload) {
        requireNonNull(payload, "payload");
        return PREFIX + HEX.formatHex(hmac(payload));
    }

    // The algorithm is a parameter only so that the failure path, which no real JVM takes, can be tested.
    static GitHubWebhookVerifier withAlgorithm(final byte[] secret, final String algorithm) {
        if (secret.length == 0) {
            throw new IllegalArgumentException("secret must not be empty");
        }
        final SecretKeySpec key = new SecretKeySpec(secret, algorithm);
        // Fails here, not on the first delivery, when the algorithm is missing.
        final Mac mac = newMac(key, algorithm);
        return new GitHubWebhookVerifier(key, algorithm, isCloneable(mac) ? mac : null);
    }

    private static void logRejected(final String reason) {
        LOG.atDebug()
                .setMessage("Webhook signature rejected: {}")
                .addArgument(reason)
                .log();
    }

    // Decided once: a clone of a keyed Mac is a ready, independent Mac, so a call skips provider lookup and init.
    private static boolean isCloneable(final Mac mac) {
        try {
            mac.clone();
            return true;
        } catch (final CloneNotSupportedException notCloneable) {
            return false;
        }
    }

    private byte[] hmac(final byte[] payload) {
        if (prototype == null) {
            // A Mac is not thread-safe, so each call gets its own.
            return newMac(key, algorithm).doFinal(payload);
        }
        try {
            return ((Mac) prototype.clone()).doFinal(payload);
        } catch (final CloneNotSupportedException unexpected) {
            throw new IllegalStateException("the Mac for " + algorithm + " was cloneable when probed", unexpected);
        }
    }

    private static Mac newMac(final SecretKeySpec key, final String algorithm) {
        try {
            final Mac mac = Mac.getInstance(algorithm);
            mac.init(key);
            return mac;
        } catch (final GeneralSecurityException failure) {
            throw new IllegalStateException("this JVM cannot compute " + algorithm, failure);
        }
    }
}
