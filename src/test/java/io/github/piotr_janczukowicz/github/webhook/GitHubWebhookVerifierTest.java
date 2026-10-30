package io.github.piotr_janczukowicz.github.webhook;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import java.io.Serial;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.MacSpi;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

@UnitTest
class GitHubWebhookVerifierTest {

    private static final String DOCUMENTED_SECRET = "It's a Secret to Everybody";
    private static final byte[] DOCUMENTED_PAYLOAD = "Hello, World!".getBytes(StandardCharsets.UTF_8);
    private static final String DOCUMENTED_SIGNATURE =
            "sha256=757107ea0eb2509fc211221cce984b8a37570b6d7586c22c46f4379c8b043e17";

    private final GitHubWebhookVerifier verifier = GitHubWebhookVerifier.of(DOCUMENTED_SECRET);

    @Test
    void sign_shouldMatchTheSignatureGitHubDocuments() {
        assertThat(verifier.sign(DOCUMENTED_PAYLOAD)).isEqualTo(DOCUMENTED_SIGNATURE);
    }

    @Test
    void sign_shouldGiveTheSameResult_whenCalledRepeatedly() {
        assertSoftly(softly -> {
            softly.assertThat(verifier.sign(DOCUMENTED_PAYLOAD)).isEqualTo(DOCUMENTED_SIGNATURE);
            softly.assertThat(verifier.sign(DOCUMENTED_PAYLOAD)).isEqualTo(DOCUMENTED_SIGNATURE);
            softly.assertThat(verifier.sign(new byte[0])).isNotEqualTo(DOCUMENTED_SIGNATURE);
            softly.assertThat(verifier.sign(DOCUMENTED_PAYLOAD)).isEqualTo(DOCUMENTED_SIGNATURE);
        });
    }

    @Test
    void isValid_shouldAcceptTheDocumentedSignature() {
        assertThat(verifier.isValid(DOCUMENTED_PAYLOAD, DOCUMENTED_SIGNATURE)).isTrue();
    }

    @Test
    void isValid_shouldAcceptUppercaseHex() {
        final String upper = "sha256=" + DOCUMENTED_SIGNATURE.substring(7).toUpperCase(Locale.ROOT);

        assertThat(verifier.isValid(DOCUMENTED_PAYLOAD, upper)).isTrue();
    }

    @Test
    void isValid_shouldReject_whenPayloadSecretOrSignatureChanged() {
        assertSoftly(softly -> {
            softly.assertThat(verifier.isValid("Hello, World?".getBytes(StandardCharsets.UTF_8), DOCUMENTED_SIGNATURE))
                    .isFalse();
            softly.assertThat(GitHubWebhookVerifier.of("another secret")
                            .isValid(DOCUMENTED_PAYLOAD, DOCUMENTED_SIGNATURE))
                    .isFalse();
            softly.assertThat(verifier.isValid(
                            DOCUMENTED_PAYLOAD,
                            DOCUMENTED_SIGNATURE.substring(0, DOCUMENTED_SIGNATURE.length() - 1) + "0"))
                    .isFalse();
        });
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(
            strings = {
                "",
                "sha256=",
                "sha256=zz",
                "sha256=757107ea0eb2509fc211221cce984b8a37570b6d7586c22c46f4379c8b043e1",
                "sha1=757107ea0eb2509fc211221cce984b8a37570b6d7586c22c46f4379c8b043e17",
                "757107ea0eb2509fc211221cce984b8a37570b6d7586c22c46f4379c8b043e17",
                "SHA256=757107ea0eb2509fc211221cce984b8a37570b6d7586c22c46f4379c8b043e17",
                " sha256=757107ea0eb2509fc211221cce984b8a37570b6d7586c22c46f4379c8b043e17"
            })
    void isValid_shouldBeFalse_whenHeaderIsMissingOrMalformed(final String header) {
        assertThat(verifier.isValid(DOCUMENTED_PAYLOAD, header)).isFalse();
    }

    @Test
    void isValid_shouldVerifyAnEmptyBody() {
        final String signature = verifier.sign(new byte[0]);

        assertThat(verifier.isValid(new byte[0], signature)).isTrue();
    }

    @Test
    void methods_shouldReject_whenArgumentNullOrBlank() {
        assertSoftly(softly -> {
            softly.assertThat(catchThrowable(() -> verifier.isValid(null, DOCUMENTED_SIGNATURE)))
                    .isInstanceOf(NullPointerException.class);
            softly.assertThat(catchThrowable(() -> verifier.sign(null))).isInstanceOf(NullPointerException.class);
            softly.assertThat(catchThrowable(() -> GitHubWebhookVerifier.of((String) null)))
                    .isInstanceOf(NullPointerException.class);
            softly.assertThat(catchThrowable(() -> GitHubWebhookVerifier.of((byte[]) null)))
                    .isInstanceOf(NullPointerException.class);
            softly.assertThat(catchThrowable(() -> GitHubWebhookVerifier.of("")))
                    .isInstanceOf(IllegalArgumentException.class);
            softly.assertThat(catchThrowable(() -> GitHubWebhookVerifier.of(new byte[0])))
                    .isInstanceOf(IllegalArgumentException.class);
        });
    }

    @Test
    void of_shouldAcceptWhitespaceOnlySecret_whenGitHubWouldAcceptIt() {
        final GitHubWebhookVerifier whitespace = GitHubWebhookVerifier.of("  ");

        assertThat(whitespace.isValid(DOCUMENTED_PAYLOAD, whitespace.sign(DOCUMENTED_PAYLOAD)))
                .isTrue();
    }

    @Test
    void of_shouldMatchStringSecret_whenGivenTheSameBytes() {
        final GitHubWebhookVerifier fromBytes =
                GitHubWebhookVerifier.of(DOCUMENTED_SECRET.getBytes(StandardCharsets.UTF_8));

        assertThat(fromBytes.sign(DOCUMENTED_PAYLOAD)).isEqualTo(DOCUMENTED_SIGNATURE);
    }

    @Test
    void of_shouldCopySecretBytes_whenArrayIsChangedAfterwards() {
        final byte[] secret = DOCUMENTED_SECRET.getBytes(StandardCharsets.UTF_8);
        final GitHubWebhookVerifier fromBytes = GitHubWebhookVerifier.of(secret);
        Arrays.fill(secret, (byte) 0);

        assertThat(fromBytes.sign(DOCUMENTED_PAYLOAD)).isEqualTo(DOCUMENTED_SIGNATURE);
    }

    @Test
    void of_shouldFailClearly_whenTheAlgorithmIsUnavailable() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookVerifier.withAlgorithm(
                DOCUMENTED_SECRET.getBytes(StandardCharsets.UTF_8), "HmacNoSuchAlgo"));

        assertThat(thrown).isInstanceOf(IllegalStateException.class).hasMessageContaining("HmacNoSuchAlgo");
    }

    @Test
    void verifier_shouldBeSafeToShareBetweenThreads() throws Exception {
        final int threads = 16;
        final int rounds = 200;
        final ExecutorService pool = Executors.newFixedThreadPool(threads);
        final CountDownLatch start = new CountDownLatch(1);
        try {
            final List<Future<Boolean>> results = new ArrayList<>();
            for (int thread = 0; thread < threads; thread++) {
                final Callable<Boolean> task = getTask(thread, start, rounds);
                results.add(pool.submit(task));
            }
            start.countDown();
            for (final Future<Boolean> result : results) {
                assertThat(result.get(60, TimeUnit.SECONDS)).isTrue();
            }
        } finally {
            pool.shutdownNow();
        }
    }

    @Test
    void verifier_shouldNeverMisjudgeASignature_whenSharedByManyThreads() throws Exception {
        final int threads = 16;
        final int rounds = 1000;
        final byte[] body = "{\"action\":\"opened\"}".getBytes(StandardCharsets.UTF_8);
        final String good = verifier.sign(body);
        final String bad = good.substring(0, good.length() - 1) + (good.endsWith("0") ? "1" : "0");
        final ExecutorService pool = Executors.newFixedThreadPool(threads);
        final CountDownLatch start = new CountDownLatch(1);
        try {
            final List<Future<Integer>> results = new ArrayList<>();
            for (int thread = 0; thread < threads; thread++) {
                results.add(pool.submit(() -> {
                    start.await();
                    int wrong = 0;
                    for (int round = 0; round < rounds; round++) {
                        final boolean valid = round % 2 == 0;
                        if (verifier.isValid(body, valid ? good : bad) != valid) {
                            wrong++;
                        }
                    }
                    return wrong;
                }));
            }
            start.countDown();
            int wrong = 0;
            for (final Future<Integer> result : results) {
                wrong += result.get(60, TimeUnit.SECONDS);
            }
            assertThat(wrong).isZero();
        } finally {
            pool.shutdownNow();
        }
    }

    @Test
    void verifier_shouldKeyAFreshMacPerCall_whenTheProviderMacCannotBeCloned() {
        final Provider provider = new NonCloneableMacProvider();
        Security.addProvider(provider);
        try {
            final GitHubWebhookVerifier uncloneable = GitHubWebhookVerifier.withAlgorithm(
                    DOCUMENTED_SECRET.getBytes(StandardCharsets.UTF_8), NonCloneableMacProvider.ALGORITHM);

            assertSoftly(softly -> {
                softly.assertThat(uncloneable.sign(DOCUMENTED_PAYLOAD)).isEqualTo(DOCUMENTED_SIGNATURE);
                softly.assertThat(uncloneable.isValid(DOCUMENTED_PAYLOAD, DOCUMENTED_SIGNATURE))
                        .isTrue();
                softly.assertThat(uncloneable.isValid(
                                "Hello, World?".getBytes(StandardCharsets.UTF_8), DOCUMENTED_SIGNATURE))
                        .isFalse();
            });
        } finally {
            Security.removeProvider(provider.getName());
        }
    }

    @Test
    void sign_shouldFailClearly_whenAMacThatClonedOnceCannotBeClonedAgain() {
        final Provider provider = new NonCloneableMacProvider();
        Security.addProvider(provider);
        try {
            final GitHubWebhookVerifier flaky = GitHubWebhookVerifier.withAlgorithm(
                    DOCUMENTED_SECRET.getBytes(StandardCharsets.UTF_8), NonCloneableMacProvider.CLONE_ONCE_ALGORITHM);

            final Throwable thrown = catchThrowable(() -> flaky.sign(DOCUMENTED_PAYLOAD));

            assertThat(thrown)
                    .isInstanceOf(IllegalStateException.class)
                    .hasMessageContaining(NonCloneableMacProvider.CLONE_ONCE_ALGORITHM);
        } finally {
            Security.removeProvider(provider.getName());
        }
    }

    private Callable<Boolean> getTask(final int thread, final CountDownLatch start, final int rounds) {
        return () -> {
            start.await();
            for (int round = 0; round < rounds; round++) {
                final byte[] body = ("delivery " + thread + "/" + round).getBytes(StandardCharsets.UTF_8);
                final String signature = verifier.sign(body);
                final byte[] other = ("delivery " + thread + "/" + (round + 1)).getBytes(StandardCharsets.UTF_8);
                if (!verifier.isValid(body, signature)
                        || verifier.isValid(other, signature)
                        || !verifier.isValid(DOCUMENTED_PAYLOAD, DOCUMENTED_SIGNATURE)) {
                    return false;
                }
            }
            return true;
        };
    }

    private static final class NonCloneableMacProvider extends Provider {
        @Serial
        private static final long serialVersionUID = 1L;

        static final String ALGORITHM = "HmacSha256NoClone";
        static final String CLONE_ONCE_ALGORITHM = "HmacSha256CloneOnce";

        NonCloneableMacProvider() {
            super("NoCloneMacProvider", "1", "test provider with a Mac that cannot be cloned");
            put("Mac." + ALGORITHM, NonCloneableMac.class.getName());
            put("Mac." + CLONE_ONCE_ALGORITHM, CloneOnceMac.class.getName());
        }
    }

    public static final class NonCloneableMac extends MacSpi {
        private final Mac delegate;

        public NonCloneableMac() throws NoSuchAlgorithmException {
            delegate = Mac.getInstance("HmacSHA256");
        }

        @Override
        protected int engineGetMacLength() {
            return delegate.getMacLength();
        }

        @Override
        protected void engineInit(final Key key, final AlgorithmParameterSpec params) throws InvalidKeyException {
            delegate.init(key);
        }

        @Override
        protected void engineUpdate(final byte input) {
            delegate.update(input);
        }

        @Override
        protected void engineUpdate(final byte[] input, final int offset, final int len) {
            delegate.update(input, offset, len);
        }

        @Override
        protected byte[] engineDoFinal() {
            return delegate.doFinal();
        }

        @Override
        protected void engineReset() {
            delegate.reset();
        }
    }

    public static final class CloneOnceMac extends MacSpi implements Cloneable {
        private final NonCloneableMac delegate;
        private boolean cloned;

        public CloneOnceMac() throws NoSuchAlgorithmException {
            delegate = new NonCloneableMac();
        }

        @Override
        public CloneOnceMac clone() throws CloneNotSupportedException {
            if (cloned) {
                throw new CloneNotSupportedException("only the first clone is allowed");
            }
            cloned = true;
            return (CloneOnceMac) super.clone();
        }

        @Override
        protected int engineGetMacLength() {
            return delegate.engineGetMacLength();
        }

        @Override
        protected void engineInit(final Key key, final AlgorithmParameterSpec params) throws InvalidKeyException {
            delegate.engineInit(key, params);
        }

        @Override
        protected void engineUpdate(final byte input) {
            delegate.engineUpdate(input);
        }

        @Override
        protected void engineUpdate(final byte[] input, final int offset, final int len) {
            delegate.engineUpdate(input, offset, len);
        }

        @Override
        protected byte[] engineDoFinal() {
            return delegate.engineDoFinal();
        }

        @Override
        protected void engineReset() {
            delegate.engineReset();
        }
    }
}
