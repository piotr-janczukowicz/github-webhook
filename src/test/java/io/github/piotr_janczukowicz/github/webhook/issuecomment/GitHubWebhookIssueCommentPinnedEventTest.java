package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueCommentPinnedEventTest {

    @Test
    void constructor_shouldThrow_whenCommentNull() {
        final GitHubWebhookIssueCommentPinnedEventBuilder builder = GitHubWebhookIssueCommentPinnedEventBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentPinnedEvent())
                .comment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("comment");
    }

    @Test
    void constructor_shouldThrow_whenIssueNull() {
        final GitHubWebhookIssueCommentPinnedEventBuilder builder = GitHubWebhookIssueCommentPinnedEventBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentPinnedEvent())
                .issue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issue");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssueCommentPinnedEventBuilder builder = GitHubWebhookIssueCommentPinnedEventBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentPinnedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssueCommentPinnedEventBuilder builder = GitHubWebhookIssueCommentPinnedEventBuilder.builder(
                        IssueCommentCatalogFixtures.webhookIssueCommentPinnedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
