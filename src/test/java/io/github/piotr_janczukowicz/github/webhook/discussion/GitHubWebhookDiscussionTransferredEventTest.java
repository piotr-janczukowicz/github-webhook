package io.github.piotr_janczukowicz.github.webhook.discussion;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDiscussionTransferredEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookDiscussionTransferredEventBuilder builder =
                GitHubWebhookDiscussionTransferredEventBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionTransferredEvent())
                        .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenDiscussionNull() {
        final GitHubWebhookDiscussionTransferredEventBuilder builder =
                GitHubWebhookDiscussionTransferredEventBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionTransferredEvent())
                        .discussion(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("discussion");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookDiscussionTransferredEventBuilder builder =
                GitHubWebhookDiscussionTransferredEventBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionTransferredEvent())
                        .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookDiscussionTransferredEventBuilder builder =
                GitHubWebhookDiscussionTransferredEventBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionTransferredEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
