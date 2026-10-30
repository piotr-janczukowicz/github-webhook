package io.github.piotr_janczukowicz.github.webhook.dismissalrequestcodescanning;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDismissalRequestCodeScanningResponseSubmittedEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookDismissalRequestCodeScanningResponseSubmittedEventBuilder builder =
                GitHubWebhookDismissalRequestCodeScanningResponseSubmittedEventBuilder.builder(
                                DismissalRequestCodeScanningCatalogFixtures
                                        .webhookDismissalRequestCodeScanningResponseSubmittedEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenExemptionResponseNull() {
        final GitHubWebhookDismissalRequestCodeScanningResponseSubmittedEventBuilder builder =
                GitHubWebhookDismissalRequestCodeScanningResponseSubmittedEventBuilder.builder(
                                DismissalRequestCodeScanningCatalogFixtures
                                        .webhookDismissalRequestCodeScanningResponseSubmittedEvent())
                        .exemptionResponse(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionResponse");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDismissalRequestCodeScanningResponseSubmittedEventBuilder builder =
                GitHubWebhookDismissalRequestCodeScanningResponseSubmittedEventBuilder.builder(
                                DismissalRequestCodeScanningCatalogFixtures
                                        .webhookDismissalRequestCodeScanningResponseSubmittedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
