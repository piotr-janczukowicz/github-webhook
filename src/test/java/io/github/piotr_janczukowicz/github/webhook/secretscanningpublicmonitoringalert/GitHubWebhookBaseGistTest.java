package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookBaseGistTest {

    @Test
    void constructor_shouldThrow_whenCommentsUrlNull() {
        final GitHubWebhookBaseGistBuilder builder = GitHubWebhookBaseGistBuilder.builder(
                        SecretScanningPublicMonitoringAlertCatalogFixtures.webhookBaseGist())
                .commentsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commentsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCommitsUrlNull() {
        final GitHubWebhookBaseGistBuilder builder = GitHubWebhookBaseGistBuilder.builder(
                        SecretScanningPublicMonitoringAlertCatalogFixtures.webhookBaseGist())
                .commitsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commitsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookBaseGistBuilder builder = GitHubWebhookBaseGistBuilder.builder(
                        SecretScanningPublicMonitoringAlertCatalogFixtures.webhookBaseGist())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenFilesNull() {
        final GitHubWebhookBaseGistBuilder builder = GitHubWebhookBaseGistBuilder.builder(
                        SecretScanningPublicMonitoringAlertCatalogFixtures.webhookBaseGist())
                .files(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("files");
    }

    @Test
    void constructor_shouldThrow_whenForksUrlNull() {
        final GitHubWebhookBaseGistBuilder builder = GitHubWebhookBaseGistBuilder.builder(
                        SecretScanningPublicMonitoringAlertCatalogFixtures.webhookBaseGist())
                .forksUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("forksUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitPullUrlNull() {
        final GitHubWebhookBaseGistBuilder builder = GitHubWebhookBaseGistBuilder.builder(
                        SecretScanningPublicMonitoringAlertCatalogFixtures.webhookBaseGist())
                .gitPullUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitPullUrl");
    }

    @Test
    void constructor_shouldThrow_whenGitPushUrlNull() {
        final GitHubWebhookBaseGistBuilder builder = GitHubWebhookBaseGistBuilder.builder(
                        SecretScanningPublicMonitoringAlertCatalogFixtures.webhookBaseGist())
                .gitPushUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("gitPushUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookBaseGistBuilder builder = GitHubWebhookBaseGistBuilder.builder(
                        SecretScanningPublicMonitoringAlertCatalogFixtures.webhookBaseGist())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenIdNull() {
        final GitHubWebhookBaseGistBuilder builder = GitHubWebhookBaseGistBuilder.builder(
                        SecretScanningPublicMonitoringAlertCatalogFixtures.webhookBaseGist())
                .id(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("id");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookBaseGistBuilder builder = GitHubWebhookBaseGistBuilder.builder(
                        SecretScanningPublicMonitoringAlertCatalogFixtures.webhookBaseGist())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookBaseGistBuilder builder = GitHubWebhookBaseGistBuilder.builder(
                        SecretScanningPublicMonitoringAlertCatalogFixtures.webhookBaseGist())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookBaseGistBuilder builder = GitHubWebhookBaseGistBuilder.builder(
                        SecretScanningPublicMonitoringAlertCatalogFixtures.webhookBaseGist())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
