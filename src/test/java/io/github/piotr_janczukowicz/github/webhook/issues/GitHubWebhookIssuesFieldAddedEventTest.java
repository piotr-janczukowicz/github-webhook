package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesFieldAddedEventTest {

    @Test
    void constructor_shouldThrow_whenIssueNull() {
        final GitHubWebhookIssuesFieldAddedEventBuilder builder = GitHubWebhookIssuesFieldAddedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesFieldAddedEvent())
                .issue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issue");
    }

    @Test
    void constructor_shouldThrow_whenIssueFieldNull() {
        final GitHubWebhookIssuesFieldAddedEventBuilder builder = GitHubWebhookIssuesFieldAddedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesFieldAddedEvent())
                .issueField(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueField");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssuesFieldAddedEventBuilder builder = GitHubWebhookIssuesFieldAddedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesFieldAddedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssuesFieldAddedEventBuilder builder = GitHubWebhookIssuesFieldAddedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesFieldAddedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
