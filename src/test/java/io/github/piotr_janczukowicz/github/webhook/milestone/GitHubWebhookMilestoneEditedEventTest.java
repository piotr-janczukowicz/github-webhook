package io.github.piotr_janczukowicz.github.webhook.milestone;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMilestoneEditedEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookMilestoneEditedEventBuilder builder = GitHubWebhookMilestoneEditedEventBuilder.builder(
                        MilestoneCatalogFixtures.webhookMilestoneEditedEvent())
                .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenMilestoneNull() {
        final GitHubWebhookMilestoneEditedEventBuilder builder = GitHubWebhookMilestoneEditedEventBuilder.builder(
                        MilestoneCatalogFixtures.webhookMilestoneEditedEvent())
                .milestone(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestone");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookMilestoneEditedEventBuilder builder = GitHubWebhookMilestoneEditedEventBuilder.builder(
                        MilestoneCatalogFixtures.webhookMilestoneEditedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookMilestoneEditedEventBuilder builder = GitHubWebhookMilestoneEditedEventBuilder.builder(
                        MilestoneCatalogFixtures.webhookMilestoneEditedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
