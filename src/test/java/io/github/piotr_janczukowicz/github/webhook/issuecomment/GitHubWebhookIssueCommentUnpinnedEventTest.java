package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueCommentUnpinnedEventTest {

    @Test
    void constructor_shouldThrow_whenCommentNull() {
        final GitHubWebhookIssueCommentUnpinnedEventBuilder builder =
                GitHubWebhookIssueCommentUnpinnedEventBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentUnpinnedEvent())
                        .comment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("comment");
    }

    @Test
    void constructor_shouldThrow_whenIssueNull() {
        final GitHubWebhookIssueCommentUnpinnedEventBuilder builder =
                GitHubWebhookIssueCommentUnpinnedEventBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentUnpinnedEvent())
                        .issue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issue");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssueCommentUnpinnedEventBuilder builder =
                GitHubWebhookIssueCommentUnpinnedEventBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentUnpinnedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssueCommentUnpinnedEventBuilder builder =
                GitHubWebhookIssueCommentUnpinnedEventBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentUnpinnedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
