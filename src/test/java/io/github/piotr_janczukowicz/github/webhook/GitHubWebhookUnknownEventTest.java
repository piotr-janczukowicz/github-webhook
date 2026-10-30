package io.github.piotr_janczukowicz.github.webhook;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import java.util.Map;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookUnknownEventTest {

    @Test
    void constructor_shouldKeepTheEventNameAndThePayload() {
        final GitHubWebhookUnknownEvent event = new GitHubWebhookUnknownEvent("new_event", Map.of("a", 1));

        assertThat(event.eventName()).isEqualTo("new_event");
        assertThat(event.payload()).containsEntry("a", 1);
    }

    @Test
    void constructor_shouldAllowNoEventName() {
        assertThat(new GitHubWebhookUnknownEvent(null, Map.of()).eventName()).isNull();
    }

    @Test
    void constructor_shouldThrow_whenPayloadNull() {
        final Throwable thrown = catchThrowable(() -> new GitHubWebhookUnknownEvent("x", null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("payload");
    }
}
