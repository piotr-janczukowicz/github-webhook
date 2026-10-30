package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestLockedPullRequestMilestoneTest {

    @Test
    void constructor_shouldThrow_whenCreatedAtNull() {
        final GitHubWebhookPullRequestLockedPullRequestMilestoneBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestMilestoneBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestMilestone())
                        .createdAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("createdAt");
    }

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestMilestoneBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestMilestoneBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestMilestone())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenLabelsUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestMilestoneBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestMilestoneBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestMilestone())
                        .labelsUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("labelsUrl");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestLockedPullRequestMilestoneBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestMilestoneBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestMilestone())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenStateNull() {
        final GitHubWebhookPullRequestLockedPullRequestMilestoneBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestMilestoneBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestMilestone())
                        .state(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("state");
    }

    @Test
    void constructor_shouldThrow_whenTitleNull() {
        final GitHubWebhookPullRequestLockedPullRequestMilestoneBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestMilestoneBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestMilestone())
                        .title(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("title");
    }

    @Test
    void constructor_shouldThrow_whenUpdatedAtNull() {
        final GitHubWebhookPullRequestLockedPullRequestMilestoneBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestMilestoneBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestMilestone())
                        .updatedAt(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("updatedAt");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestMilestoneBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestMilestoneBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestMilestone())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
