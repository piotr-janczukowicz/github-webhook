package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPublicMonitoringAlertWebhookTest {

    @Test
    void constructor_shouldThrow_whenAttributionNull() {
        final GitHubWebhookPublicMonitoringAlertWebhookBuilder builder =
                GitHubWebhookPublicMonitoringAlertWebhookBuilder.builder(
                                SecretScanningPublicMonitoringAlertCatalogFixtures
                                        .webhookPublicMonitoringAlertWebhook())
                        .attribution(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("attribution");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPublicMonitoringAlertWebhookBuilder builder =
                GitHubWebhookPublicMonitoringAlertWebhookBuilder.builder(
                                SecretScanningPublicMonitoringAlertCatalogFixtures
                                        .webhookPublicMonitoringAlertWebhook())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenSecretTypeNull() {
        final GitHubWebhookPublicMonitoringAlertWebhookBuilder builder =
                GitHubWebhookPublicMonitoringAlertWebhookBuilder.builder(
                                SecretScanningPublicMonitoringAlertCatalogFixtures
                                        .webhookPublicMonitoringAlertWebhook())
                        .secretType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("secretType");
    }

    @Test
    void constructor_shouldThrow_whenSecretTypeDisplayNameNull() {
        final GitHubWebhookPublicMonitoringAlertWebhookBuilder builder =
                GitHubWebhookPublicMonitoringAlertWebhookBuilder.builder(
                                SecretScanningPublicMonitoringAlertCatalogFixtures
                                        .webhookPublicMonitoringAlertWebhook())
                        .secretTypeDisplayName(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("secretTypeDisplayName");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPublicMonitoringAlertWebhookBuilder builder =
                GitHubWebhookPublicMonitoringAlertWebhookBuilder.builder(
                                SecretScanningPublicMonitoringAlertCatalogFixtures
                                        .webhookPublicMonitoringAlertWebhook())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }

    @Test
    void constructor_shouldThrow_whenValidityNull() {
        final GitHubWebhookPublicMonitoringAlertWebhookBuilder builder =
                GitHubWebhookPublicMonitoringAlertWebhookBuilder.builder(
                                SecretScanningPublicMonitoringAlertCatalogFixtures
                                        .webhookPublicMonitoringAlertWebhook())
                        .validity(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("validity");
    }
}
