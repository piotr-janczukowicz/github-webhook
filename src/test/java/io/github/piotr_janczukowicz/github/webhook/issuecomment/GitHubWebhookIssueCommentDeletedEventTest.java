package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueCommentDeletedEventTest {

    @Test
    void constructor_shouldThrow_whenCommentNull() {
        final GitHubWebhookIssueCommentDeletedEventBuilder builder =
                GitHubWebhookIssueCommentDeletedEventBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedEvent())
                        .comment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("comment");
    }

    @Test
    void constructor_shouldThrow_whenIssueNull() {
        final GitHubWebhookIssueCommentDeletedEventBuilder builder =
                GitHubWebhookIssueCommentDeletedEventBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedEvent())
                        .issue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issue");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssueCommentDeletedEventBuilder builder =
                GitHubWebhookIssueCommentDeletedEventBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssueCommentDeletedEventBuilder builder =
                GitHubWebhookIssueCommentDeletedEventBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentDeletedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
