package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesUnlabeledEventTest {

    @Test
    void constructor_shouldThrow_whenIssueNull() {
        final GitHubWebhookIssuesUnlabeledEventBuilder builder = GitHubWebhookIssuesUnlabeledEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesUnlabeledEvent())
                .issue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issue");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssuesUnlabeledEventBuilder builder = GitHubWebhookIssuesUnlabeledEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesUnlabeledEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssuesUnlabeledEventBuilder builder = GitHubWebhookIssuesUnlabeledEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesUnlabeledEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
