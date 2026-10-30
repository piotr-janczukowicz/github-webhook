package io.github.piotr_janczukowicz.github.webhook.projectsv2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2ProjectTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookProjectsV2ProjectBuilder builder = GitHubWebhookProjectsV2ProjectBuilder.builder(
                        ProjectsV2CatalogFixtures.webhookProjectsV2Project())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenCreatorNull() {
        final GitHubWebhookProjectsV2ProjectBuilder builder = GitHubWebhookProjectsV2ProjectBuilder.builder(
                        ProjectsV2CatalogFixtures.webhookProjectsV2Project())
                .creator(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("creator");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookProjectsV2ProjectBuilder builder = GitHubWebhookProjectsV2ProjectBuilder.builder(
                        ProjectsV2CatalogFixtures.webhookProjectsV2Project())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenOwnerNull() {
        final GitHubWebhookProjectsV2ProjectBuilder builder = GitHubWebhookProjectsV2ProjectBuilder.builder(
                        ProjectsV2CatalogFixtures.webhookProjectsV2Project())
                .owner(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("owner");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookProjectsV2ProjectBuilder builder = GitHubWebhookProjectsV2ProjectBuilder.builder(
                        ProjectsV2CatalogFixtures.webhookProjectsV2Project())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookProjectsV2ProjectBuilder builder = GitHubWebhookProjectsV2ProjectBuilder.builder(
                        ProjectsV2CatalogFixtures.webhookProjectsV2Project())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
