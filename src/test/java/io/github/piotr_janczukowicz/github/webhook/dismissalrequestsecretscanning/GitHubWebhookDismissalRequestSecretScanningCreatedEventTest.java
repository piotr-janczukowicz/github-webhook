package io.github.piotr_janczukowicz.github.webhook.dismissalrequestsecretscanning;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDismissalRequestSecretScanningCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookDismissalRequestSecretScanningCreatedEventBuilder builder =
                GitHubWebhookDismissalRequestSecretScanningCreatedEventBuilder.builder(
                                DismissalRequestSecretScanningCatalogFixtures
                                        .webhookDismissalRequestSecretScanningCreatedEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDismissalRequestSecretScanningCreatedEventBuilder builder =
                GitHubWebhookDismissalRequestSecretScanningCreatedEventBuilder.builder(
                                DismissalRequestSecretScanningCatalogFixtures
                                        .webhookDismissalRequestSecretScanningCreatedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
