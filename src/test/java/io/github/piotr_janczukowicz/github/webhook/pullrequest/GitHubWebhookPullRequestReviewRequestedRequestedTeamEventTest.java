package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewRequestedRequestedTeamEventTest {

    @Test
    void constructor_shouldThrow_whenPullRequestNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamEventBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamEvent())
                        .pullRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequest");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamEventBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamEventBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamEvent())
                        .requestedTeam(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeam");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookPullRequestReviewRequestedRequestedTeamEventBuilder builder =
                GitHubWebhookPullRequestReviewRequestedRequestedTeamEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestedRequestedTeamEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
