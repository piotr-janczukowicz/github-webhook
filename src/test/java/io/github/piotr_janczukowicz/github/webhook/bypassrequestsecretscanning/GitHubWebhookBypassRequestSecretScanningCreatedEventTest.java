package io.github.piotr_janczukowicz.github.webhook.bypassrequestsecretscanning;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookBypassRequestSecretScanningCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenExemptionRequestNull() {
        final GitHubWebhookBypassRequestSecretScanningCreatedEventBuilder builder =
                GitHubWebhookBypassRequestSecretScanningCreatedEventBuilder.builder(
                                BypassRequestSecretScanningCatalogFixtures
                                        .webhookBypassRequestSecretScanningCreatedEvent())
                        .exemptionRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("exemptionRequest");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookBypassRequestSecretScanningCreatedEventBuilder builder =
                GitHubWebhookBypassRequestSecretScanningCreatedEventBuilder.builder(
                                BypassRequestSecretScanningCatalogFixtures
                                        .webhookBypassRequestSecretScanningCreatedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
