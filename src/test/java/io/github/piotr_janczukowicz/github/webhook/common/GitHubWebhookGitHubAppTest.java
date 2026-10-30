package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookGitHubAppTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookGitHubAppBuilder builder = GitHubWebhookGitHubAppBuilder.builder(
                        CommonCatalogFixtures.webhookGitHubApp())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenEventsNull() {
        final GitHubWebhookGitHubAppBuilder builder = GitHubWebhookGitHubAppBuilder.builder(
                        CommonCatalogFixtures.webhookGitHubApp())
                .events(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("events");
    }

    @Test
    void constructor_shouldThrow_whenExternalUrlNull() {
        final GitHubWebhookGitHubAppBuilder builder = GitHubWebhookGitHubAppBuilder.builder(
                        CommonCatalogFixtures.webhookGitHubApp())
                .externalUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("externalUrl");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookGitHubAppBuilder builder = GitHubWebhookGitHubAppBuilder.builder(
                        CommonCatalogFixtures.webhookGitHubApp())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookGitHubAppBuilder builder = GitHubWebhookGitHubAppBuilder.builder(
                        CommonCatalogFixtures.webhookGitHubApp())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookGitHubAppBuilder builder = GitHubWebhookGitHubAppBuilder.builder(
                        CommonCatalogFixtures.webhookGitHubApp())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenOwnerNull() {
        final GitHubWebhookGitHubAppBuilder builder = GitHubWebhookGitHubAppBuilder.builder(
                        CommonCatalogFixtures.webhookGitHubApp())
                .owner(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("owner");
    }

    @Test
    void constructor_shouldThrow_whenPermissionsNull() {
        final GitHubWebhookGitHubAppBuilder builder = GitHubWebhookGitHubAppBuilder.builder(
                        CommonCatalogFixtures.webhookGitHubApp())
                .permissions(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("permissions");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookGitHubAppBuilder builder = GitHubWebhookGitHubAppBuilder.builder(
                        CommonCatalogFixtures.webhookGitHubApp())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
