package io.github.piotr_janczukowicz.github.webhook.dismissalrequestsecretscanning;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDismissalRequestSecretScanningResponseDismissedEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookDismissalRequestSecretScanningResponseDismissedEventBuilder builder =
                GitHubWebhookDismissalRequestSecretScanningResponseDismissedEventBuilder.builder(
                                DismissalRequestSecretScanningCatalogFixtures
                                        .webhookDismissalRequestSecretScanningResponseDismissedEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenExemptionResponseNull() {
        final GitHubWebhookDismissalRequestSecretScanningResponseDismissedEventBuilder builder =
                GitHubWebhookDismissalRequestSecretScanningResponseDismissedEventBuilder.builder(
                                DismissalRequestSecretScanningCatalogFixtures
                                        .webhookDismissalRequestSecretScanningResponseDismissedEvent())
                        .exemptionResponse(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionResponse");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDismissalRequestSecretScanningResponseDismissedEventBuilder builder =
                GitHubWebhookDismissalRequestSecretScanningResponseDismissedEventBuilder.builder(
                                DismissalRequestSecretScanningCatalogFixtures
                                        .webhookDismissalRequestSecretScanningResponseDismissedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
