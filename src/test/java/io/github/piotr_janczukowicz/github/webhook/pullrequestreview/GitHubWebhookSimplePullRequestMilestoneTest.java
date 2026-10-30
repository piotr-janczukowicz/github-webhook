package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSimplePullRequestMilestoneTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookSimplePullRequestMilestoneBuilder builder =
                GitHubWebhookSimplePullRequestMilestoneBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestMilestone())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookSimplePullRequestMilestoneBuilder builder =
                GitHubWebhookSimplePullRequestMilestoneBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestMilestone())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookSimplePullRequestMilestoneBuilder builder =
                GitHubWebhookSimplePullRequestMilestoneBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestMilestone())
                        .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookSimplePullRequestMilestoneBuilder builder =
                GitHubWebhookSimplePullRequestMilestoneBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestMilestone())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookSimplePullRequestMilestoneBuilder builder =
                GitHubWebhookSimplePullRequestMilestoneBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestMilestone())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookSimplePullRequestMilestoneBuilder builder =
                GitHubWebhookSimplePullRequestMilestoneBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestMilestone())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookSimplePullRequestMilestoneBuilder builder =
                GitHubWebhookSimplePullRequestMilestoneBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestMilestone())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookSimplePullRequestMilestoneBuilder builder =
                GitHubWebhookSimplePullRequestMilestoneBuilder.builder(
                                PullRequestReviewCatalogFixtures.webhookSimplePullRequestMilestone())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
