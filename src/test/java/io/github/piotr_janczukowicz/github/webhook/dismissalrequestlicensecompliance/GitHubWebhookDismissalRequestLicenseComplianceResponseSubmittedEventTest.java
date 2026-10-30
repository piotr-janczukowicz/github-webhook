package io.github.piotr_janczukowicz.github.webhook.dismissalrequestlicensecompliance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDismissalRequestLicenseComplianceResponseSubmittedEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookDismissalRequestLicenseComplianceResponseSubmittedEventBuilder builder =
                GitHubWebhookDismissalRequestLicenseComplianceResponseSubmittedEventBuilder.builder(
                                DismissalRequestLicenseComplianceCatalogFixtures
                                        .webhookDismissalRequestLicenseComplianceResponseSubmittedEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenExemptionResponseNull() {
        final GitHubWebhookDismissalRequestLicenseComplianceResponseSubmittedEventBuilder builder =
                GitHubWebhookDismissalRequestLicenseComplianceResponseSubmittedEventBuilder.builder(
                                DismissalRequestLicenseComplianceCatalogFixtures
                                        .webhookDismissalRequestLicenseComplianceResponseSubmittedEvent())
                        .exemptionResponse(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionResponse");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDismissalRequestLicenseComplianceResponseSubmittedEventBuilder builder =
                GitHubWebhookDismissalRequestLicenseComplianceResponseSubmittedEventBuilder.builder(
                                DismissalRequestLicenseComplianceCatalogFixtures
                                        .webhookDismissalRequestLicenseComplianceResponseSubmittedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
