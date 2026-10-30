package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMilestoneTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookMilestoneBuilder builder = GitHubWebhookMilestoneBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookMilestone())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookMilestoneBuilder builder = GitHubWebhookMilestoneBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookMilestone())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookMilestoneBuilder builder = GitHubWebhookMilestoneBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookMilestone())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookMilestoneBuilder builder = GitHubWebhookMilestoneBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookMilestone())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookMilestoneBuilder builder = GitHubWebhookMilestoneBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookMilestone())
                .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookMilestoneBuilder builder = GitHubWebhookMilestoneBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookMilestone())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookMilestoneBuilder builder = GitHubWebhookMilestoneBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookMilestone())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookMilestoneBuilder builder = GitHubWebhookMilestoneBuilder.builder(
                        PullRequestReviewThreadCatalogFixtures.webhookMilestone())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
