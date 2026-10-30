package io.github.piotr_janczukowicz.github.webhook.discussion;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDiscussionTest {

    @Test
    void constructor_shouldThrow_whenBodyNull() {
        final GitHubWebhookDiscussionBuilder builder = GitHubWebhookDiscussionBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussion())
                .body(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("body");
    }

    @Test
    void constructor_shouldThrow_whenCategoryNull() {
        final GitHubWebhookDiscussionBuilder builder = GitHubWebhookDiscussionBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussion())
                .category(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("category");
    }

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookDiscussionBuilder builder = GitHubWebhookDiscussionBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussion())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookDiscussionBuilder builder = GitHubWebhookDiscussionBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussion())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookDiscussionBuilder builder = GitHubWebhookDiscussionBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussion())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryUrlNull() {
        final GitHubWebhookDiscussionBuilder builder = GitHubWebhookDiscussionBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussion())
                .repositoryUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoryUrl");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookDiscussionBuilder builder = GitHubWebhookDiscussionBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussion())
                .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookDiscussionBuilder builder = GitHubWebhookDiscussionBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussion())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookDiscussionBuilder builder = GitHubWebhookDiscussionBuilder.builder(
                        DiscussionCatalogFixtures.webhookDiscussion())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }
}
