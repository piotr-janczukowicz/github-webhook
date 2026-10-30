package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2ItemTest {

    @Test
    void constructor_shouldThrow_whenContentNodeIdNull() {
        final GitHubWebhookProjectsV2ItemBuilder builder = GitHubWebhookProjectsV2ItemBuilder.builder(
                        ProjectsV2ItemCatalogFixtures.webhookProjectsV2Item())
                .contentNodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentNodeId");
    }

    @Test
    void constructor_shouldThrow_whenContentTypeNull() {
        final GitHubWebhookProjectsV2ItemBuilder builder = GitHubWebhookProjectsV2ItemBuilder.builder(
                        ProjectsV2ItemCatalogFixtures.webhookProjectsV2Item())
                .contentType(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("contentType");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookProjectsV2ItemBuilder builder = GitHubWebhookProjectsV2ItemBuilder.builder(
                        ProjectsV2ItemCatalogFixtures.webhookProjectsV2Item())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookProjectsV2ItemBuilder builder = GitHubWebhookProjectsV2ItemBuilder.builder(
                        ProjectsV2ItemCatalogFixtures.webhookProjectsV2Item())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
