package io.github.piotr_janczukowicz.github.webhook.project;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectTest {

    @Test
    void constructor_shouldThrow_whenColumnsUrlNull() {
        final GitHubWebhookProjectBuilder builder = GitHubWebhookProjectBuilder.builder(
                        ProjectCatalogFixtures.webhookProject())
                .columnsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("columnsUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookProjectBuilder builder = GitHubWebhookProjectBuilder.builder(
                        ProjectCatalogFixtures.webhookProject())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookProjectBuilder builder = GitHubWebhookProjectBuilder.builder(
                        ProjectCatalogFixtures.webhookProject())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookProjectBuilder builder = GitHubWebhookProjectBuilder.builder(
                        ProjectCatalogFixtures.webhookProject())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookProjectBuilder builder = GitHubWebhookProjectBuilder.builder(
                        ProjectCatalogFixtures.webhookProject())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenOwnerUrlNull() {
        final GitHubWebhookProjectBuilder builder = GitHubWebhookProjectBuilder.builder(
                        ProjectCatalogFixtures.webhookProject())
                .ownerUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("ownerUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookProjectBuilder builder = GitHubWebhookProjectBuilder.builder(
                        ProjectCatalogFixtures.webhookProject())
                .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookProjectBuilder builder = GitHubWebhookProjectBuilder.builder(
                        ProjectCatalogFixtures.webhookProject())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookProjectBuilder builder = GitHubWebhookProjectBuilder.builder(
                        ProjectCatalogFixtures.webhookProject())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
