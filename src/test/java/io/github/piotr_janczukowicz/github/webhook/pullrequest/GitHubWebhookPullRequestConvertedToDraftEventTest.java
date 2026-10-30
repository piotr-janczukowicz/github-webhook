package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPullRequestConvertedToDraftEventTest {

    @Test
    void constructor_shouldThrow_whenPullRequestNull() {
        final GitHubWebhookPullRequestConvertedToDraftEventBuilder builder =
                GitHubWebhookPullRequestConvertedToDraftEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestConvertedToDraftEvent())
                        .pullRequest(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("pullRequest");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookPullRequestConvertedToDraftEventBuilder builder =
                GitHubWebhookPullRequestConvertedToDraftEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestConvertedToDraftEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookPullRequestConvertedToDraftEventBuilder builder =
                GitHubWebhookPullRequestConvertedToDraftEventBuilder.builder(
                                PullRequestCatalogFixtures.webhookPullRequestConvertedToDraftEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
