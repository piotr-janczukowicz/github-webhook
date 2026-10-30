package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueCommentEditedEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookIssueCommentEditedEventBuilder builder = GitHubWebhookIssueCommentEditedEventBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedEvent())
                .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenCommentNull() {
        final GitHubWebhookIssueCommentEditedEventBuilder builder = GitHubWebhookIssueCommentEditedEventBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedEvent())
                .comment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("comment");
    }

    @Test
    void constructor_shouldThrow_whenIssueNull() {
        final GitHubWebhookIssueCommentEditedEventBuilder builder = GitHubWebhookIssueCommentEditedEventBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedEvent())
                .issue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issue");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssueCommentEditedEventBuilder builder = GitHubWebhookIssueCommentEditedEventBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssueCommentEditedEventBuilder builder = GitHubWebhookIssueCommentEditedEventBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentEditedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
