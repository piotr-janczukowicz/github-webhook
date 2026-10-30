package io.github.piotr_janczukowicz.github.webhook.bypassrequestsecretscanning;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookBypassRequestSecretScanningResponseSubmittedEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookBypassRequestSecretScanningResponseSubmittedEventBuilder builder =
                GitHubWebhookBypassRequestSecretScanningResponseSubmittedEventBuilder.builder(
                                BypassRequestSecretScanningCatalogFixtures
                                        .webhookBypassRequestSecretScanningResponseSubmittedEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenExemptionResponseNull() {
        final GitHubWebhookBypassRequestSecretScanningResponseSubmittedEventBuilder builder =
                GitHubWebhookBypassRequestSecretScanningResponseSubmittedEventBuilder.builder(
                                BypassRequestSecretScanningCatalogFixtures
                                        .webhookBypassRequestSecretScanningResponseSubmittedEvent())
                        .exemptionResponse(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionResponse");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookBypassRequestSecretScanningResponseSubmittedEventBuilder builder =
                GitHubWebhookBypassRequestSecretScanningResponseSubmittedEventBuilder.builder(
                                BypassRequestSecretScanningCatalogFixtures
                                        .webhookBypassRequestSecretScanningResponseSubmittedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
