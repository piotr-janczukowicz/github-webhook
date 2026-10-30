package io.github.piotr_janczukowicz.github.webhook.milestone;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMilestoneDeletedEventTest {

    @Test
    void constructor_shouldThrow_whenMilestoneNull() {
        final GitHubWebhookMilestoneDeletedEventBuilder builder = GitHubWebhookMilestoneDeletedEventBuilder.builder(
                        MilestoneCatalogFixtures.webhookMilestoneDeletedEvent())
                .milestone(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestone");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookMilestoneDeletedEventBuilder builder = GitHubWebhookMilestoneDeletedEventBuilder.builder(
                        MilestoneCatalogFixtures.webhookMilestoneDeletedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookMilestoneDeletedEventBuilder builder = GitHubWebhookMilestoneDeletedEventBuilder.builder(
                        MilestoneCatalogFixtures.webhookMilestoneDeletedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
