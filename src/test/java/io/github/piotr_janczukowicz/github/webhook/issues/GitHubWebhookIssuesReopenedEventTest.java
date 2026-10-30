package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesReopenedEventTest {

    @Test
    void constructor_shouldThrow_whenIssueNull() {
        final GitHubWebhookIssuesReopenedEventBuilder builder = GitHubWebhookIssuesReopenedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesReopenedEvent())
                .issue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issue");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssuesReopenedEventBuilder builder = GitHubWebhookIssuesReopenedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesReopenedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssuesReopenedEventBuilder builder = GitHubWebhookIssuesReopenedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesReopenedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
