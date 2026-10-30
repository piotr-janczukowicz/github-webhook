package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookWorkflowTest {

    @Test
    void constructor_shouldThrow_whenBadgeUrlNull() {
        final GitHubWebhookWorkflowBuilder builder = GitHubWebhookWorkflowBuilder.builder(
                        CommonCatalogFixtures.webhookWorkflow())
                .badgeUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("badgeUrl");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookWorkflowBuilder builder = GitHubWebhookWorkflowBuilder.builder(
                        CommonCatalogFixtures.webhookWorkflow())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookWorkflowBuilder builder = GitHubWebhookWorkflowBuilder.builder(
                        CommonCatalogFixtures.webhookWorkflow())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookWorkflowBuilder builder = GitHubWebhookWorkflowBuilder.builder(
                        CommonCatalogFixtures.webhookWorkflow())
                .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookWorkflowBuilder builder = GitHubWebhookWorkflowBuilder.builder(
                        CommonCatalogFixtures.webhookWorkflow())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPathNull() {
        final GitHubWebhookWorkflowBuilder builder = GitHubWebhookWorkflowBuilder.builder(
                        CommonCatalogFixtures.webhookWorkflow())
                .path(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("path");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookWorkflowBuilder builder = GitHubWebhookWorkflowBuilder.builder(
                        CommonCatalogFixtures.webhookWorkflow())
                .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookWorkflowBuilder builder = GitHubWebhookWorkflowBuilder.builder(
                        CommonCatalogFixtures.webhookWorkflow())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookWorkflowBuilder builder = GitHubWebhookWorkflowBuilder.builder(
                        CommonCatalogFixtures.webhookWorkflow())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
