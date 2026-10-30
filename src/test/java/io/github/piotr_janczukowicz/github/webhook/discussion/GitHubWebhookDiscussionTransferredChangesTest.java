package io.github.piotr_janczukowicz.github.webhook.discussion;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDiscussionTransferredChangesTest {

    @Test
    void constructor_shouldThrow_whenNewDiscussionNull() {
        final GitHubWebhookDiscussionTransferredChangesBuilder builder =
                GitHubWebhookDiscussionTransferredChangesBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionTransferredChanges())
                        .newDiscussion(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("newDiscussion");
    }

    @Test
    void constructor_shouldThrow_whenNewRepositoryNull() {
        final GitHubWebhookDiscussionTransferredChangesBuilder builder =
                GitHubWebhookDiscussionTransferredChangesBuilder.builder(
                                DiscussionCatalogFixtures.webhookDiscussionTransferredChanges())
                        .newRepository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("newRepository");
    }
}
