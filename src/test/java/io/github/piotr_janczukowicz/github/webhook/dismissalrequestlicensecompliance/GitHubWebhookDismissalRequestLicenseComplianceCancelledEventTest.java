package io.github.piotr_janczukowicz.github.webhook.dismissalrequestlicensecompliance;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDismissalRequestLicenseComplianceCancelledEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookDismissalRequestLicenseComplianceCancelledEventBuilder builder =
                GitHubWebhookDismissalRequestLicenseComplianceCancelledEventBuilder.builder(
                                DismissalRequestLicenseComplianceCatalogFixtures
                                        .webhookDismissalRequestLicenseComplianceCancelledEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDismissalRequestLicenseComplianceCancelledEventBuilder builder =
                GitHubWebhookDismissalRequestLicenseComplianceCancelledEventBuilder.builder(
                                DismissalRequestLicenseComplianceCatalogFixtures
                                        .webhookDismissalRequestLicenseComplianceCancelledEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
