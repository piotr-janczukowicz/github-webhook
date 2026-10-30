package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookIssueCommentCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenCommentNull() {
        final GitHubWebhookIssueCommentCreatedEventBuilder builder =
                GitHubWebhookIssueCommentCreatedEventBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedEvent())
                        .comment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("comment");
    }

    @Test
    void constructor_shouldThrow_whenIssueNull() {
        final GitHubWebhookIssueCommentCreatedEventBuilder builder =
                GitHubWebhookIssueCommentCreatedEventBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedEvent())
                        .issue(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("issue");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookIssueCommentCreatedEventBuilder builder =
                GitHubWebhookIssueCommentCreatedEventBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookIssueCommentCreatedEventBuilder builder =
                GitHubWebhookIssueCommentCreatedEventBuilder.builder(
                                IssueCommentCatalogFixtures.webhookIssueCommentCreatedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
