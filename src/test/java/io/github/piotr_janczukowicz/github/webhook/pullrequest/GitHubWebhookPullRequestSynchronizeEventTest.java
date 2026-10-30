package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestSynchronizeEventTest {

    @Test
    void constructor_shouldThrow_whenAfterNull() {
        final GitHubWebhookPullRequestSynchronizeEventBuilder builder =
                GitHubWebhookPullRequestSynchronizeEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizeEvent())
                        .after(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("after");
    }

    @Test
    void constructor_shouldThrow_whenBeforeNull() {
        final GitHubWebhookPullRequestSynchronizeEventBuilder builder =
                GitHubWebhookPullRequestSynchronizeEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizeEvent())
                        .before(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("before");
    }

    @Test
    void constructor_shouldThrow_whenPullRequestNull() {
        final GitHubWebhookPullRequestSynchronizeEventBuilder builder =
                GitHubWebhookPullRequestSynchronizeEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizeEvent())
                        .pullRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequest");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookPullRequestSynchronizeEventBuilder builder =
                GitHubWebhookPullRequestSynchronizeEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizeEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookPullRequestSynchronizeEventBuilder builder =
                GitHubWebhookPullRequestSynchronizeEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestSynchronizeEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
