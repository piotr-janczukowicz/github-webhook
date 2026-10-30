package io.github.piotr_janczukowicz.github.webhook.dismissalrequestcodescanning;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDismissalRequestCodeScanningCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookDismissalRequestCodeScanningCreatedEventBuilder builder =
                GitHubWebhookDismissalRequestCodeScanningCreatedEventBuilder.builder(
                                DismissalRequestCodeScanningCatalogFixtures
                                        .webhookDismissalRequestCodeScanningCreatedEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDismissalRequestCodeScanningCreatedEventBuilder builder =
                GitHubWebhookDismissalRequestCodeScanningCreatedEventBuilder.builder(
                                DismissalRequestCodeScanningCatalogFixtures
                                        .webhookDismissalRequestCodeScanningCreatedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
