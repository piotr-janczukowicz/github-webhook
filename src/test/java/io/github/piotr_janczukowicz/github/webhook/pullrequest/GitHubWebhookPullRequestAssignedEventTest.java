package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestAssignedEventTest {

    @Test
    void constructor_shouldThrow_whenPullRequestNull() {
        final GitHubWebhookPullRequestAssignedEventBuilder builder =
                GitHubWebhookPullRequestAssignedEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedEvent())
                        .pullRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequest");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookPullRequestAssignedEventBuilder builder =
                GitHubWebhookPullRequestAssignedEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookPullRequestAssignedEventBuilder builder =
                GitHubWebhookPullRequestAssignedEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestAssignedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
