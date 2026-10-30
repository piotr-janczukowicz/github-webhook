package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamTest {

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeam())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenMembersUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeam())
                        .membersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("membersUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeam())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeam())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPermissionNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeam())
                        .permission(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("permission");
    }

    @Test
    void constructor_shouldThrow_whenPrivacyNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeam())
                        .privacy(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("privacy");
    }

    @Test
    void constructor_shouldThrow_whenRepositoriesUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeam())
                        .repositoriesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoriesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSlugNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeam())
                        .slug(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("slug");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestReviewCommentCatalogFixtures
                                        .webhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeam())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
