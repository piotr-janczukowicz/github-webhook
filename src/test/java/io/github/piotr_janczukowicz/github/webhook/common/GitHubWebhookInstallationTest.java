package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookInstallationTest {

    @Test
    void constructor_shouldThrow_whenAccessTokensUrlNull() {
        final GitHubWebhookInstallationBuilder builder = GitHubWebhookInstallationBuilder.builder(
                        CommonCatalogFixtures.webhookInstallation())
                .accessTokensUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("accessTokensUrl");
    }

    @Test
    void constructor_shouldThrow_whenAppSlugNull() {
        final GitHubWebhookInstallationBuilder builder = GitHubWebhookInstallationBuilder.builder(
                        CommonCatalogFixtures.webhookInstallation())
                .appSlug(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("appSlug");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookInstallationBuilder builder = GitHubWebhookInstallationBuilder.builder(
                        CommonCatalogFixtures.webhookInstallation())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsNull() {
        final GitHubWebhookInstallationBuilder builder = GitHubWebhookInstallationBuilder.builder(
                        CommonCatalogFixtures.webhookInstallation())
                .events(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("events");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookInstallationBuilder builder = GitHubWebhookInstallationBuilder.builder(
                        CommonCatalogFixtures.webhookInstallation())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenPermissionsNull() {
        final GitHubWebhookInstallationBuilder builder = GitHubWebhookInstallationBuilder.builder(
                        CommonCatalogFixtures.webhookInstallation())
                .permissions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("permissions");
    }

    @Test
    void constructor_shouldThrow_whenRepositoriesUrlNull() {
        final GitHubWebhookInstallationBuilder builder = GitHubWebhookInstallationBuilder.builder(
                        CommonCatalogFixtures.webhookInstallation())
                .repositoriesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoriesUrl");
    }

    @Test
    void constructor_shouldThrow_whenRepositorySelectionNull() {
        final GitHubWebhookInstallationBuilder builder = GitHubWebhookInstallationBuilder.builder(
                        CommonCatalogFixtures.webhookInstallation())
                .repositorySelection(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositorySelection");
    }

    @Test
    void constructor_shouldThrow_whenTargetTypeNull() {
        final GitHubWebhookInstallationBuilder builder = GitHubWebhookInstallationBuilder.builder(
                        CommonCatalogFixtures.webhookInstallation())
                .targetType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("targetType");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookInstallationBuilder builder = GitHubWebhookInstallationBuilder.builder(
                        CommonCatalogFixtures.webhookInstallation())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
