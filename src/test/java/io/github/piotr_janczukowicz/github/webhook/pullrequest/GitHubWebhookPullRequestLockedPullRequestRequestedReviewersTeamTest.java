package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamTest {

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestRequestedReviewersTeam())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenMembersUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestRequestedReviewersTeam())
                        .membersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("membersUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestRequestedReviewersTeam())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestRequestedReviewersTeam())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPermissionNull() {
        final GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestRequestedReviewersTeam())
                        .permission(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("permission");
    }

    @Test
    void constructor_shouldThrow_whenPrivacyNull() {
        final GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestRequestedReviewersTeam())
                        .privacy(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("privacy");
    }

    @Test
    void constructor_shouldThrow_whenRepositoriesUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestRequestedReviewersTeam())
                        .repositoriesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoriesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSlugNull() {
        final GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestRequestedReviewersTeam())
                        .slug(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("slug");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestRequestedReviewersTeam())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
