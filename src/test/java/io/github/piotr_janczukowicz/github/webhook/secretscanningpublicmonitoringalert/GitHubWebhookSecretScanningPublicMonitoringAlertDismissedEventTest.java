package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecretScanningPublicMonitoringAlertDismissedEventTest {

    @Test
    void constructor_shouldThrow_whenAlertNull() {
        final GitHubWebhookSecretScanningPublicMonitoringAlertDismissedEventBuilder builder =
                GitHubWebhookSecretScanningPublicMonitoringAlertDismissedEventBuilder.builder(
                                SecretScanningPublicMonitoringAlertCatalogFixtures
                                        .webhookSecretScanningPublicMonitoringAlertDismissedEvent())
                        .alert(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("alert");
    }

    @Test
    void constructor_shouldThrow_whenEnterpriseNull() {
        final GitHubWebhookSecretScanningPublicMonitoringAlertDismissedEventBuilder builder =
                GitHubWebhookSecretScanningPublicMonitoringAlertDismissedEventBuilder.builder(
                                SecretScanningPublicMonitoringAlertCatalogFixtures
                                        .webhookSecretScanningPublicMonitoringAlertDismissedEvent())
                        .enterprise(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("enterprise");
    }
}
