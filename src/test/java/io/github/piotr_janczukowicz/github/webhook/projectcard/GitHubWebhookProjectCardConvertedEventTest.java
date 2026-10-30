package io.github.piotr_janczukowicz.github.webhook.projectcard;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectCardConvertedEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookProjectCardConvertedEventBuilder builder =
                GitHubWebhookProjectCardConvertedEventBuilder.builder(
                                ProjectCardCatalogFixtures.webhookProjectCardConvertedEvent())
                        .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenProjectCardNull() {
        final GitHubWebhookProjectCardConvertedEventBuilder builder =
                GitHubWebhookProjectCardConvertedEventBuilder.builder(
                                ProjectCardCatalogFixtures.webhookProjectCardConvertedEvent())
                        .projectCard(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectCard");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookProjectCardConvertedEventBuilder builder =
                GitHubWebhookProjectCardConvertedEventBuilder.builder(
                                ProjectCardCatalogFixtures.webhookProjectCardConvertedEvent())
                        .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
