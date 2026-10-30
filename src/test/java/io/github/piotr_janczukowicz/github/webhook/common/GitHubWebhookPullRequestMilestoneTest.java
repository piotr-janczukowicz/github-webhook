package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestMilestoneTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestMilestoneBuilder builder = GitHubWebhookPullRequestMilestoneBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestMilestone())
                .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestMilestoneBuilder builder = GitHubWebhookPullRequestMilestoneBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestMilestone())
                .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookPullRequestMilestoneBuilder builder = GitHubWebhookPullRequestMilestoneBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestMilestone())
                .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestMilestoneBuilder builder = GitHubWebhookPullRequestMilestoneBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestMilestone())
                .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestMilestoneBuilder builder = GitHubWebhookPullRequestMilestoneBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestMilestone())
                .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestMilestoneBuilder builder = GitHubWebhookPullRequestMilestoneBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestMilestone())
                .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestMilestoneBuilder builder = GitHubWebhookPullRequestMilestoneBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestMilestone())
                .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestMilestoneBuilder builder = GitHubWebhookPullRequestMilestoneBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestMilestone())
                .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
