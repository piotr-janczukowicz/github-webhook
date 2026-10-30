package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesAssignedEventTest {

    @Test
    void constructor_shouldThrow_whenIssueNull() {
        final GitHubWebhookIssuesAssignedEventBuilder builder = GitHubWebhookIssuesAssignedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesAssignedEvent())
                .issue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issue");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssuesAssignedEventBuilder builder = GitHubWebhookIssuesAssignedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesAssignedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssuesAssignedEventBuilder builder = GitHubWebhookIssuesAssignedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesAssignedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
