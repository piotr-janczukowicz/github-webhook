package io.github.piotr_janczukowicz.github.webhook;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import java.util.Map;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeliveryTest {

    private static final GitHubWebhookEvent EVENT = new GitHubWebhookUnknownEvent("x", Map.of());

    @Test
    void constructor_shouldThrowNullPointerException_whenEventNull() {
        final Throwable thrown = catchThrowable(() -> new GitHubWebhookDelivery("x", null, Map.of()));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("event");
    }

    @Test
    void constructor_shouldHaveNoFallbackReason_whenCreatedWithoutOne() {
        final GitHubWebhookDelivery delivery = new GitHubWebhookDelivery("x", EVENT, Map.of());

        assertThat(delivery.fallbackReason()).isNull();
    }

    @Test
    void constructor_shouldThrowNullPointerException_whenPayloadNull() {
        final Throwable thrown = catchThrowable(() -> new GitHubWebhookDelivery("x", EVENT, null));

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("payload");
    }
}
