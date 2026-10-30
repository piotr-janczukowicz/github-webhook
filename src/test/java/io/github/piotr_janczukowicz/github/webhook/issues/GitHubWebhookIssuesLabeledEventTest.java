package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesLabeledEventTest {

    @Test
    void constructor_shouldThrow_whenIssueNull() {
        final GitHubWebhookIssuesLabeledEventBuilder builder = GitHubWebhookIssuesLabeledEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLabeledEvent())
                .issue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issue");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssuesLabeledEventBuilder builder = GitHubWebhookIssuesLabeledEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLabeledEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssuesLabeledEventBuilder builder = GitHubWebhookIssuesLabeledEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesLabeledEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
