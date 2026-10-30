package io.github.piotr_janczukowicz.github.webhook.bypassrequestsecretscanning;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import java.util.Map;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookBypassRequestSecretScanningUnknownActionEventTest {

    @Test
    void constructor_shouldKeepActionAndPayload() {
        final GitHubWebhookBypassRequestSecretScanningUnknownActionEvent event =
                new GitHubWebhookBypassRequestSecretScanningUnknownActionEvent("future", Map.of("key", "value"));

        assertThat(event.action()).isEqualTo("future");
        assertThat(event.payload()).containsEntry("key", "value");
    }

    @Test
    void constructor_shouldThrow_whenPayloadNull() {
        final Throwable thrown =
                catchThrowable(() -> new GitHubWebhookBypassRequestSecretScanningUnknownActionEvent("future", null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("payload");
    }
}
