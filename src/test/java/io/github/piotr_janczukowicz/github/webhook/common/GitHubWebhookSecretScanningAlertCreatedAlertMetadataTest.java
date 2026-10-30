package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecretScanningAlertCreatedAlertMetadataTest {

    @Test
    void constructor_shouldThrow_whenKeyNull() {
        final GitHubWebhookSecretScanningAlertCreatedAlertMetadataBuilder builder =
                GitHubWebhookSecretScanningAlertCreatedAlertMetadataBuilder.builder(
                                CommonCatalogFixtures.webhookSecretScanningAlertCreatedAlertMetadata())
                        .key(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("key");
    }

    @Test
    void constructor_shouldThrow_whenValueNull() {
        final GitHubWebhookSecretScanningAlertCreatedAlertMetadataBuilder builder =
                GitHubWebhookSecretScanningAlertCreatedAlertMetadataBuilder.builder(
                                CommonCatalogFixtures.webhookSecretScanningAlertCreatedAlertMetadata())
                        .value(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("value");
    }
}
