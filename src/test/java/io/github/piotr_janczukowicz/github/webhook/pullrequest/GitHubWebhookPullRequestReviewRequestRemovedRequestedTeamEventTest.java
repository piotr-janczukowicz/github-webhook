package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamEventTest {

    @Test
    void constructor_shouldThrow_whenPullRequestNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamEventBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestRemovedRequestedTeamEvent())
                        .pullRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequest");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamEventBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestRemovedRequestedTeamEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenRequestedTeamNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamEventBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestRemovedRequestedTeamEvent())
                        .requestedTeam(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("requestedTeam");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamEventBuilder builder =
                GitHubWebhookPullRequestReviewRequestRemovedRequestedTeamEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestReviewRequestRemovedRequestedTeamEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
