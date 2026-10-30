package io.github.piotr_janczukowicz.github.webhook.dismissalrequestsecretscanning;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDismissalRequestSecretScanningCancelledEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookDismissalRequestSecretScanningCancelledEventBuilder builder =
                GitHubWebhookDismissalRequestSecretScanningCancelledEventBuilder.builder(
                                DismissalRequestSecretScanningCatalogFixtures
                                        .webhookDismissalRequestSecretScanningCancelledEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDismissalRequestSecretScanningCancelledEventBuilder builder =
                GitHubWebhookDismissalRequestSecretScanningCancelledEventBuilder.builder(
                                DismissalRequestSecretScanningCatalogFixtures
                                        .webhookDismissalRequestSecretScanningCancelledEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
