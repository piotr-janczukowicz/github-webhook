package io.github.piotr_janczukowicz.github.webhook.bypassrequestsecretscanning;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookBypassRequestSecretScanningCompletedEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookBypassRequestSecretScanningCompletedEventBuilder builder =
                GitHubWebhookBypassRequestSecretScanningCompletedEventBuilder.builder(
                                BypassRequestSecretScanningCatalogFixtures
                                        .webhookBypassRequestSecretScanningCompletedEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookBypassRequestSecretScanningCompletedEventBuilder builder =
                GitHubWebhookBypassRequestSecretScanningCompletedEventBuilder.builder(
                                BypassRequestSecretScanningCatalogFixtures
                                        .webhookBypassRequestSecretScanningCompletedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
