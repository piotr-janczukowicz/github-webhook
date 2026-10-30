package io.github.piotr_janczukowicz.github.webhook.bypassrequestsecretscanning;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookBypassRequestSecretScanningCancelledEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookBypassRequestSecretScanningCancelledEventBuilder builder =
                GitHubWebhookBypassRequestSecretScanningCancelledEventBuilder.builder(
                                BypassRequestSecretScanningCatalogFixtures
                                        .webhookBypassRequestSecretScanningCancelledEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookBypassRequestSecretScanningCancelledEventBuilder builder =
                GitHubWebhookBypassRequestSecretScanningCancelledEventBuilder.builder(
                                BypassRequestSecretScanningCatalogFixtures
                                        .webhookBypassRequestSecretScanningCancelledEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
