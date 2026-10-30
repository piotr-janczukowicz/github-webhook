package io.github.piotr_janczukowicz.github.webhook.issuerelatesto;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import java.util.Map;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueRelatesToUnknownActionEventTest {

    @Test
    void constructor_shouldKeepActionAndPayload() {
        final GitHubWebhookIssueRelatesToUnknownActionEvent event =
                new GitHubWebhookIssueRelatesToUnknownActionEvent("future", Map.of("key", "value"));

        assertThat(event.action()).isEqualTo("future");
        assertThat(event.payload()).containsEntry("key", "value");
    }

    @Test
    void constructor_shouldThrow_whenPayloadNull() {
        final Throwable thrown =
                catchThrowable(() -> new GitHubWebhookIssueRelatesToUnknownActionEvent("future", null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("payload");
    }
}
