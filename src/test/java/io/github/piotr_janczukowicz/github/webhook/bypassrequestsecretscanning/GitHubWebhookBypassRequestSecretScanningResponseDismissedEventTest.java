package io.github.piotr_janczukowicz.github.webhook.bypassrequestsecretscanning;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookBypassRequestSecretScanningResponseDismissedEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookBypassRequestSecretScanningResponseDismissedEventBuilder builder =
                GitHubWebhookBypassRequestSecretScanningResponseDismissedEventBuilder.builder(
                                BypassRequestSecretScanningCatalogFixtures
                                        .webhookBypassRequestSecretScanningResponseDismissedEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenExemptionResponseNull() {
        final GitHubWebhookBypassRequestSecretScanningResponseDismissedEventBuilder builder =
                GitHubWebhookBypassRequestSecretScanningResponseDismissedEventBuilder.builder(
                                BypassRequestSecretScanningCatalogFixtures
                                        .webhookBypassRequestSecretScanningResponseDismissedEvent())
                        .exemptionResponse(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionResponse");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookBypassRequestSecretScanningResponseDismissedEventBuilder builder =
                GitHubWebhookBypassRequestSecretScanningResponseDismissedEventBuilder.builder(
                                BypassRequestSecretScanningCatalogFixtures
                                        .webhookBypassRequestSecretScanningResponseDismissedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
