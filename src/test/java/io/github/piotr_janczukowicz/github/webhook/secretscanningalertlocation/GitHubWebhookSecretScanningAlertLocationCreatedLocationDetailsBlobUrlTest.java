package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrlTest {

    @Test
    void constructor_shouldThrow_whenBlobShaNull() {
        final GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrlBuilder builder =
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrlBuilder.builder(
                                SecretScanningAlertLocationCatalogFixtures
                                        .webhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrl())
                        .blobSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("blobSha");
    }

    @Test
    void constructor_shouldThrow_whenBlobUrlNull() {
        final GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrlBuilder builder =
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrlBuilder.builder(
                                SecretScanningAlertLocationCatalogFixtures
                                        .webhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrl())
                        .blobUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("blobUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitShaNull() {
        final GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrlBuilder builder =
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrlBuilder.builder(
                                SecretScanningAlertLocationCatalogFixtures
                                        .webhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrl())
                        .commitSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitSha");
    }

    @Test
    void constructor_shouldThrow_whenCommitUrlNull() {
        final GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrlBuilder builder =
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrlBuilder.builder(
                                SecretScanningAlertLocationCatalogFixtures
                                        .webhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrl())
                        .commitUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitUrl");
    }

    @Test
    void constructor_shouldThrow_whenPathNull() {
        final GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrlBuilder builder =
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrlBuilder.builder(
                                SecretScanningAlertLocationCatalogFixtures
                                        .webhookSecretScanningAlertLocationCreatedLocationDetailsBlobUrl())
                        .path(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("path");
    }
}
