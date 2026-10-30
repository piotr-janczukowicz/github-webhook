package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestLinksTest {

    @Test
    void constructor_shouldThrow_whenCommentsNull() {
        final GitHubWebhookPullRequestLinksBuilder builder = GitHubWebhookPullRequestLinksBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestLinks())
                .comments(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("comments");
    }

    @Test
    void constructor_shouldThrow_whenCommitsNull() {
        final GitHubWebhookPullRequestLinksBuilder builder = GitHubWebhookPullRequestLinksBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestLinks())
                .commits(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("commits");
    }

    @Test
    void constructor_shouldThrow_whenHtmlNull() {
        final GitHubWebhookPullRequestLinksBuilder builder = GitHubWebhookPullRequestLinksBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestLinks())
                .html(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("html");
    }

    @Test
    void constructor_shouldThrow_whenIssueNull() {
        final GitHubWebhookPullRequestLinksBuilder builder = GitHubWebhookPullRequestLinksBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestLinks())
                .issue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issue");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentNull() {
        final GitHubWebhookPullRequestLinksBuilder builder = GitHubWebhookPullRequestLinksBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestLinks())
                .reviewComment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewComment");
    }

    @Test
    void constructor_shouldThrow_whenReviewCommentsNull() {
        final GitHubWebhookPullRequestLinksBuilder builder = GitHubWebhookPullRequestLinksBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestLinks())
                .reviewComments(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("reviewComments");
    }

    @Test
    void constructor_shouldThrow_whenSelfNull() {
        final GitHubWebhookPullRequestLinksBuilder builder = GitHubWebhookPullRequestLinksBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestLinks())
                .self(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("self");
    }

    @Test
    void constructor_shouldThrow_whenStatusesNull() {
        final GitHubWebhookPullRequestLinksBuilder builder = GitHubWebhookPullRequestLinksBuilder.builder(
                        CommonCatalogFixtures.webhookPullRequestLinks())
                .statuses(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("statuses");
    }
}
