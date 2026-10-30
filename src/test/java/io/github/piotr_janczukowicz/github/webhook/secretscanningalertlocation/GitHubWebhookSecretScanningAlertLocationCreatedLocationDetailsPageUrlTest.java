package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPageUrlTest {

    @Test
    void constructor_shouldThrow_whenBlobShaNull() {
        final GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPageUrlBuilder builder =
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPageUrlBuilder.builder(
                                SecretScanningAlertLocationCatalogFixtures
                                        .webhookSecretScanningAlertLocationCreatedLocationDetailsPageUrl())
                        .blobSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("blobSha");
    }

    @Test
    void constructor_shouldThrow_whenCommitShaNull() {
        final GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPageUrlBuilder builder =
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPageUrlBuilder.builder(
                                SecretScanningAlertLocationCatalogFixtures
                                        .webhookSecretScanningAlertLocationCreatedLocationDetailsPageUrl())
                        .commitSha(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitSha");
    }

    @Test
    void constructor_shouldThrow_whenCommitUrlNull() {
        final GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPageUrlBuilder builder =
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPageUrlBuilder.builder(
                                SecretScanningAlertLocationCatalogFixtures
                                        .webhookSecretScanningAlertLocationCreatedLocationDetailsPageUrl())
                        .commitUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitUrl");
    }

    @Test
    void constructor_shouldThrow_whenPageUrlNull() {
        final GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPageUrlBuilder builder =
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPageUrlBuilder.builder(
                                SecretScanningAlertLocationCatalogFixtures
                                        .webhookSecretScanningAlertLocationCreatedLocationDetailsPageUrl())
                        .pageUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pageUrl");
    }

    @Test
    void constructor_shouldThrow_whenPathNull() {
        final GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPageUrlBuilder builder =
                GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsPageUrlBuilder.builder(
                                SecretScanningAlertLocationCatalogFixtures
                                        .webhookSecretScanningAlertLocationCreatedLocationDetailsPageUrl())
                        .path(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("path");
    }
}
