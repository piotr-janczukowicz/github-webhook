package io.github.piotr_janczukowicz.github.webhook.projectcard;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectCardEditedEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookProjectCardEditedEventBuilder builder = GitHubWebhookProjectCardEditedEventBuilder.builder(
                        ProjectCardCatalogFixtures.webhookProjectCardEditedEvent())
                .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenProjectCardNull() {
        final GitHubWebhookProjectCardEditedEventBuilder builder = GitHubWebhookProjectCardEditedEventBuilder.builder(
                        ProjectCardCatalogFixtures.webhookProjectCardEditedEvent())
                .projectCard(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectCard");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookProjectCardEditedEventBuilder builder = GitHubWebhookProjectCardEditedEventBuilder.builder(
                        ProjectCardCatalogFixtures.webhookProjectCardEditedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
