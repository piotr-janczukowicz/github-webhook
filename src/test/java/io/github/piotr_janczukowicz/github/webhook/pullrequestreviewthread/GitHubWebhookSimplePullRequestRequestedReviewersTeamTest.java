package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookSimplePullRequestRequestedReviewersTeamTest {

    @Test
    void constructor_shouldThrow_whenHtmlUrlNull() {
        final GitHubWebhookSimplePullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookSimplePullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookSimplePullRequestRequestedReviewersTeam())
                        .htmlUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("htmlUrl");
    }

    @Test
    void constructor_shouldThrow_whenMembersUrlNull() {
        final GitHubWebhookSimplePullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookSimplePullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookSimplePullRequestRequestedReviewersTeam())
                        .membersUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("membersUrl");
    }

    @Test
    void constructor_shouldThrow_whenNameNull() {
        final GitHubWebhookSimplePullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookSimplePullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookSimplePullRequestRequestedReviewersTeam())
                        .name(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("name");
    }

    @Test
    void constructor_shouldThrow_whenNodeIdNull() {
        final GitHubWebhookSimplePullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookSimplePullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookSimplePullRequestRequestedReviewersTeam())
                        .nodeId(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("nodeId");
    }

    @Test
    void constructor_shouldThrow_whenPermissionNull() {
        final GitHubWebhookSimplePullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookSimplePullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookSimplePullRequestRequestedReviewersTeam())
                        .permission(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("permission");
    }

    @Test
    void constructor_shouldThrow_whenPrivacyNull() {
        final GitHubWebhookSimplePullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookSimplePullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookSimplePullRequestRequestedReviewersTeam())
                        .privacy(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("privacy");
    }

    @Test
    void constructor_shouldThrow_whenRepositoriesUrlNull() {
        final GitHubWebhookSimplePullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookSimplePullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookSimplePullRequestRequestedReviewersTeam())
                        .repositoriesUrl(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repositoriesUrl");
    }

    @Test
    void constructor_shouldThrow_whenSlugNull() {
        final GitHubWebhookSimplePullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookSimplePullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookSimplePullRequestRequestedReviewersTeam())
                        .slug(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("slug");
    }

    @Test
    void constructor_shouldThrow_whenUrlNull() {
        final GitHubWebhookSimplePullRequestRequestedReviewersTeamBuilder builder =
                GitHubWebhookSimplePullRequestRequestedReviewersTeamBuilder.builder(
                                PullRequestReviewThreadCatalogFixtures.webhookSimplePullRequestRequestedReviewersTeam())
                        .url(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("url");
    }
}
