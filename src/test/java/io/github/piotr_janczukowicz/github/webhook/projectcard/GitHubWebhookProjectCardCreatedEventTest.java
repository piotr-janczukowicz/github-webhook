package io.github.piotr_janczukowicz.github.webhook.projectcard;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectCardCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenProjectCardNull() {
        final GitHubWebhookProjectCardCreatedEventBuilder builder = GitHubWebhookProjectCardCreatedEventBuilder.builder(
                        ProjectCardCatalogFixtures.webhookProjectCardCreatedEvent())
                .projectCard(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectCard");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookProjectCardCreatedEventBuilder builder = GitHubWebhookProjectCardCreatedEventBuilder.builder(
                        ProjectCardCatalogFixtures.webhookProjectCardCreatedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
