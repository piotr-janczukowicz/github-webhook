package io.github.piotr_janczukowicz.github.webhook;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

import io.github.piotr_janczukowicz.github.webhook.ping.GitHubWebhookPingEvent;
import io.github.piotr_janczukowicz.testsupport.UnitTest;
import io.github.piotr_janczukowicz.util.FileUtils;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookReceiverTest {

    private static final byte[] SECRET = "It's a Secret to Everybody".getBytes(StandardCharsets.UTF_8);

    private final GitHubWebhookReceiver receiver = GitHubWebhookReceiver.of(SECRET);
    private final byte[] body = FileUtils.readBytes(GitHubWebhookReceiverTest.class, "ping/webhook-ping-event.json");

    @Test
    void receive_shouldDecode_whenSignatureValid() {
        final String signature = GitHubWebhookVerifier.of(SECRET).sign(body);

        final GitHubWebhookEvent event = receiver.receive("ping", signature, body);

        assertThat(event).isInstanceOf(GitHubWebhookPingEvent.class);
    }

    @Test
    void receiveDelivery_shouldKeepTheBody_whenSignatureValid() {
        final String signature = GitHubWebhookVerifier.of(SECRET).sign(body);

        final GitHubWebhookDelivery delivery = receiver.receiveDelivery("ping", signature, body);

        assertSoftly(softly -> {
            softly.assertThat(delivery.eventName()).isEqualTo("ping");
            softly.assertThat(delivery.event()).isInstanceOf(GitHubWebhookPingEvent.class);
            softly.assertThat(delivery.payload()).containsKey("zen");
        });
    }

    @Test
    void receiveDelivery_shouldThrowSignatureException_whenSignatureInvalid() {
        final Throwable thrown = catchThrowable(() -> receiver.receiveDelivery("ping", "sha256=00", body));

        assertThat(thrown).isInstanceOf(GitHubWebhookSignatureException.class);
    }

    @Test
    void receive_shouldNotParseTheBody_whenSignatureInvalid() {
        final byte[] notJson = "not json at all".getBytes(StandardCharsets.UTF_8);

        final Throwable thrown = catchThrowable(() -> receiver.receive("ping", "sha256=00", notJson));

        assertThat(thrown).isInstanceOf(GitHubWebhookSignatureException.class);
    }

    @Test
    void receive_shouldThrowSignatureException_whenSignatureHeaderMissing() {
        final Throwable thrown = catchThrowable(() -> receiver.receive("ping", null, body));

        assertThat(thrown).isInstanceOf(GitHubWebhookSignatureException.class);
    }

    @Test
    void receive_shouldThrowSignatureException_whenBodyChangedAfterSigning() {
        final String signature = GitHubWebhookVerifier.of(SECRET).sign(body);
        final byte[] changed =
                new String(body, StandardCharsets.UTF_8).replace("{", "{ ").getBytes(StandardCharsets.UTF_8);

        final Throwable thrown = catchThrowable(() -> receiver.receive("ping", signature, changed));

        assertThat(thrown).isInstanceOf(GitHubWebhookSignatureException.class);
    }

    @Test
    void receive_shouldDecode_whenReceiverBuiltFromTextSecret() {
        final GitHubWebhookReceiver fromText = GitHubWebhookReceiver.of("It's a Secret to Everybody");
        final String signature = GitHubWebhookVerifier.of(SECRET).sign(body);

        final GitHubWebhookEvent event = fromText.receive("ping", signature, body);

        assertThat(event).isInstanceOf(GitHubWebhookPingEvent.class);
    }

    @Test
    void receive_shouldDecodeWithEitherSecret_whenReceiverHoldsOldAndNew() {
        final GitHubWebhookReceiver rotating = GitHubWebhookReceiver.ofSecrets(List.of("new-secret", "old-secret"));
        final String signedWithOld = GitHubWebhookVerifier.of("old-secret").sign(body);
        final String signedWithNew = GitHubWebhookVerifier.of("new-secret").sign(body);

        final GitHubWebhookEvent old = rotating.receive("ping", signedWithOld, body);
        final GitHubWebhookEvent fresh = rotating.receive("ping", signedWithNew, body);

        assertSoftly(softly -> {
            softly.assertThat(old).isInstanceOf(GitHubWebhookPingEvent.class);
            softly.assertThat(fresh).isInstanceOf(GitHubWebhookPingEvent.class);
        });
    }

    @Test
    void receive_shouldThrowSignatureException_whenSignedWithNoneOfTheSecrets() {
        final GitHubWebhookReceiver rotating = GitHubWebhookReceiver.ofSecrets(List.of("new-secret", "old-secret"));
        final String signature = GitHubWebhookVerifier.of("other").sign(body);

        final Throwable thrown = catchThrowable(() -> rotating.receive("ping", signature, body));

        assertThat(thrown).isInstanceOf(GitHubWebhookSignatureException.class);
    }

    @Test
    void ofSecrets_shouldThrowIllegalArgumentException_whenNoSecrets() {
        final List<String> none = List.of();

        final Throwable thrown = catchThrowable(() -> GitHubWebhookReceiver.ofSecrets(none));

        assertThat(thrown).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("secrets");
    }

    @Test
    void ofSecrets_shouldThrowNullPointerException_whenOneSecretNull() {
        final List<String> secrets = Arrays.asList("new-secret", null);

        final Throwable thrown = catchThrowable(() -> GitHubWebhookReceiver.ofSecrets(secrets));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("secret");
    }

    @Test
    void ofSecrets_shouldThrowIllegalArgumentException_whenOneSecretEmpty() {
        final List<String> secrets = List.of("new-secret", "");

        final Throwable thrown = catchThrowable(() -> GitHubWebhookReceiver.ofSecrets(secrets));

        assertThat(thrown).isInstanceOf(IllegalArgumentException.class).hasMessageContaining("secret");
    }

    @Test
    void ofSecrets_shouldThrowNullPointerException_whenSecretsNull() {
        final Throwable thrown = catchThrowable(() -> GitHubWebhookReceiver.ofSecrets(null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("secrets");
    }

    @Test
    void receive_shouldRefuseTheBodyBeforeSigning_whenBodyLargerThanTheLimit() {
        final byte[] huge = new byte[GitHubWebhookDecoder.MAX_BODY_BYTES + 1];

        final Throwable thrown = catchThrowable(() -> receiver.receive("push", "sha256=00", huge));

        assertThat(thrown).isInstanceOf(GitHubWebhookDecodeException.class).hasMessageContaining("larger than");
    }

    @Test
    void receive_shouldThrowNullPointerException_whenBodyNull() {
        final Throwable thrown = catchThrowable(() -> receiver.receive("ping", "sha256=00", null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("body");
    }
}
