package io.github.piotr_janczukowicz.github.webhook.milestone;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMilestoneCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenMilestoneNull() {
        final GitHubWebhookMilestoneCreatedEventBuilder builder = GitHubWebhookMilestoneCreatedEventBuilder.builder(
                        MilestoneCatalogFixtures.webhookMilestoneCreatedEvent())
                .milestone(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestone");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookMilestoneCreatedEventBuilder builder = GitHubWebhookMilestoneCreatedEventBuilder.builder(
                        MilestoneCatalogFixtures.webhookMilestoneCreatedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookMilestoneCreatedEventBuilder builder = GitHubWebhookMilestoneCreatedEventBuilder.builder(
                        MilestoneCatalogFixtures.webhookMilestoneCreatedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
