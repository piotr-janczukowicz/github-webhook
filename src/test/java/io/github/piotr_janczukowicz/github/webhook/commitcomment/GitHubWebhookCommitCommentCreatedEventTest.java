package io.github.piotr_janczukowicz.github.webhook.commitcomment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookCommitCommentCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenCommentNull() {
        final GitHubWebhookCommitCommentCreatedEventBuilder builder =
                GitHubWebhookCommitCommentCreatedEventBuilder.builder(
                                CommitCommentCatalogFixtures.webhookCommitCommentCreatedEvent())
                        .comment(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("comment");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookCommitCommentCreatedEventBuilder builder =
                GitHubWebhookCommitCommentCreatedEventBuilder.builder(
                                CommitCommentCatalogFixtures.webhookCommitCommentCreatedEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookCommitCommentCreatedEventBuilder builder =
                GitHubWebhookCommitCommentCreatedEventBuilder.builder(
                                CommitCommentCatalogFixtures.webhookCommitCommentCreatedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
