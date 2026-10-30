package io.github.piotr_janczukowicz.github.webhook;

import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonEmpty;
import static io.github.piotr_janczukowicz.util.ValidationUtils.requireNonNull;

import java.util.List;
import org.jspecify.annotations.Nullable;

/**
 * Receives a webhook delivery: checks the signature against the raw body, then decodes it. A delivery with a missing or
 * wrong signature is never parsed, and a body above 25 MiB is refused before the signature is computed.
 *
 * <pre>{@code
 * GitHubWebhookReceiver receiver = GitHubWebhookReceiver.of(secret);
 * GitHubWebhookEvent event = receiver.receive(
 *         request.header("X-GitHub-Event"), request.header("X-Hub-Signature-256"), request.readBody());
 * }</pre>
 *
 * <p>The receiver is thread-safe; build it once and share it.
 */
public final class GitHubWebhookReceiver {

    private final List<GitHubWebhookVerifier> verifiers;
    private final GitHubWebhookDecoder decoder;

    private GitHubWebhookReceiver(final List<GitHubWebhookVerifier> verifiers, final GitHubWebhookDecoder decoder) {
        this.verifiers = verifiers;
        this.decoder = decoder;
    }

    /**
     * Creates a receiver for one webhook secret.
     *
     * @param secret the webhook secret
     * @return the receiver
     * @throws NullPointerException if {@code secret} is {@code null}
     * @throws IllegalArgumentException if {@code secret} is empty
     */
    public static GitHubWebhookReceiver of(final String secret) {
        return new GitHubWebhookReceiver(List.of(GitHubWebhookVerifier.of(secret)), GitHubWebhookDecoder.create());
    }

    /**
     * Creates a receiver for one webhook secret that is held as bytes. The array is copied.
     *
     * @param secret the webhook secret
     * @return the receiver
     * @throws NullPointerException if {@code secret} is {@code null}
     * @throws IllegalArgumentException if {@code secret} is empty
     */
    public static GitHubWebhookReceiver of(final byte[] secret) {
        return new GitHubWebhookReceiver(List.of(GitHubWebhookVerifier.of(secret)), GitHubWebhookDecoder.create());
    }

    /**
     * Creates a receiver that accepts a delivery signed with any of several secrets, to rotate a secret: list the new
     * and the old one until GitHub sends only the new one.
     *
     * @param secrets the webhook secrets, at least one
     * @return the receiver
     * @throws NullPointerException if {@code secrets} or one of them is {@code null}
     * @throws IllegalArgumentException if {@code secrets} is empty or one of them is empty
     */
    public static GitHubWebhookReceiver ofSecrets(final List<String> secrets) {
        requireNonEmpty(secrets, "secrets");
        final List<GitHubWebhookVerifier> verifiers =
                secrets.stream().map(GitHubWebhookVerifier::of).toList();
        return new GitHubWebhookReceiver(verifiers, GitHubWebhookDecoder.create());
    }

    /**
     * Verifies and decodes one delivery.
     *
     * @param eventHeader value of the {@code X-GitHub-Event} header, or {@code null}
     * @param signatureHeader value of the {@code X-Hub-Signature-256} header, or {@code null}
     * @param body the raw request body, exactly as received
     * @return the typed event, or an unknown event
     * @throws NullPointerException if {@code body} is {@code null}
     * @throws GitHubWebhookSignatureException if the signature is missing or does not match
     * @throws GitHubWebhookDecodeException if the body is above 25 MiB, which is refused before the signature is
     *     checked, or cannot be decoded
     */
    public GitHubWebhookEvent receive(
            final @Nullable String eventHeader, final @Nullable String signatureHeader, final byte[] body) {
        verify(eventHeader, signatureHeader, body);
        return decoder.decode(eventHeader, body);
    }

    /**
     * Verifies and decodes one delivery, and keeps its body next to the typed event.
     *
     * @param eventHeader value of the {@code X-GitHub-Event} header, or {@code null}
     * @param signatureHeader value of the {@code X-Hub-Signature-256} header, or {@code null}
     * @param body the raw request body, exactly as received
     * @return the typed event with the body as a map
     * @throws NullPointerException if {@code body} is {@code null}
     * @throws GitHubWebhookSignatureException if the signature is missing or does not match
     * @throws GitHubWebhookDecodeException if the body is above 25 MiB, which is refused before the signature is
     *     checked, or cannot be decoded
     */
    public GitHubWebhookDelivery receiveDelivery(
            final @Nullable String eventHeader, final @Nullable String signatureHeader, final byte[] body) {
        verify(eventHeader, signatureHeader, body);
        return decoder.decodeDelivery(eventHeader, body);
    }

    private void verify(final @Nullable String eventHeader, final @Nullable String signatureHeader, final byte[] body) {
        requireNonNull(body, "body");
        if (body.length > GitHubWebhookDecoder.MAX_BODY_BYTES) {
            throw new GitHubWebhookDecodeException(
                    eventHeader,
                    null,
                    "the body is larger than " + GitHubWebhookDecoder.MAX_BODY_BYTES + " bytes",
                    null);
        }
        if (verifiers.stream().noneMatch(verifier -> verifier.isValid(body, signatureHeader))) {
            throw new GitHubWebhookSignatureException();
        }
    }
}
