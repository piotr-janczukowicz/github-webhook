package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesEditedEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookIssuesEditedEventBuilder builder = GitHubWebhookIssuesEditedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesEditedEvent())
                .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenIssueNull() {
        final GitHubWebhookIssuesEditedEventBuilder builder = GitHubWebhookIssuesEditedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesEditedEvent())
                .issue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issue");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssuesEditedEventBuilder builder = GitHubWebhookIssuesEditedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesEditedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssuesEditedEventBuilder builder = GitHubWebhookIssuesEditedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesEditedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
