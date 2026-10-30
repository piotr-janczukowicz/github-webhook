package io.github.piotr_janczukowicz.github.webhook.milestone;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookMilestoneOpenedEventTest {

    @Test
    void constructor_shouldThrow_whenMilestoneNull() {
        final GitHubWebhookMilestoneOpenedEventBuilder builder = GitHubWebhookMilestoneOpenedEventBuilder.builder(
                        MilestoneCatalogFixtures.webhookMilestoneOpenedEvent())
                .milestone(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("milestone");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookMilestoneOpenedEventBuilder builder = GitHubWebhookMilestoneOpenedEventBuilder.builder(
                        MilestoneCatalogFixtures.webhookMilestoneOpenedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookMilestoneOpenedEventBuilder builder = GitHubWebhookMilestoneOpenedEventBuilder.builder(
                        MilestoneCatalogFixtures.webhookMilestoneOpenedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
