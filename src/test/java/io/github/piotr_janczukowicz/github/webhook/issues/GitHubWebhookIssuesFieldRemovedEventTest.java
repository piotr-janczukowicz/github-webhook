package io.github.piotr_janczukowicz.github.webhook.issues;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssuesFieldRemovedEventTest {

    @Test
    void constructor_shouldThrow_whenIssueNull() {
        final GitHubWebhookIssuesFieldRemovedEventBuilder builder = GitHubWebhookIssuesFieldRemovedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesFieldRemovedEvent())
                .issue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issue");
    }

    @Test
    void constructor_shouldThrow_whenIssueFieldNull() {
        final GitHubWebhookIssuesFieldRemovedEventBuilder builder = GitHubWebhookIssuesFieldRemovedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesFieldRemovedEvent())
                .issueField(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issueField");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssuesFieldRemovedEventBuilder builder = GitHubWebhookIssuesFieldRemovedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesFieldRemovedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssuesFieldRemovedEventBuilder builder = GitHubWebhookIssuesFieldRemovedEventBuilder.builder(
                        IssuesCatalogFixtures.webhookIssuesFieldRemovedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
