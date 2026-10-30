package io.github.piotr_janczukowicz.github.webhook.dismissalrequestlicensecompliance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDismissalRequestLicenseComplianceCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookDismissalRequestLicenseComplianceCreatedEventBuilder builder =
                GitHubWebhookDismissalRequestLicenseComplianceCreatedEventBuilder.builder(
                                DismissalRequestLicenseComplianceCatalogFixtures
                                        .webhookDismissalRequestLicenseComplianceCreatedEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDismissalRequestLicenseComplianceCreatedEventBuilder builder =
                GitHubWebhookDismissalRequestLicenseComplianceCreatedEventBuilder.builder(
                                DismissalRequestLicenseComplianceCatalogFixtures
                                        .webhookDismissalRequestLicenseComplianceCreatedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
