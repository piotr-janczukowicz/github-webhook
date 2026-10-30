package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesTransferredEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookIssuesTransferredEventBuilder builder = GitHubWebhookIssuesTransferredEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesTransferredEvent())
                .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenIssueNull() {
        final GitHubWebhookIssuesTransferredEventBuilder builder = GitHubWebhookIssuesTransferredEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesTransferredEvent())
                .issue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issue");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssuesTransferredEventBuilder builder = GitHubWebhookIssuesTransferredEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesTransferredEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssuesTransferredEventBuilder builder = GitHubWebhookIssuesTransferredEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesTransferredEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
