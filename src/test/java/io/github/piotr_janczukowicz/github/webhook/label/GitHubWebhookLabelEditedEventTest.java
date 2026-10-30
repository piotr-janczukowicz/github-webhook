package io.github.piotr_janczukowicz.github.webhook.label;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookLabelEditedEventTest {

    @Test
    void constructor_shouldThrow_whenLabelNull() {
        final GitHubWebhookLabelEditedEventBuilder builder = GitHubWebhookLabelEditedEventBuilder.builder(
                        LabelCatalogFixtures.webhookLabelEditedEvent())
                .label(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("label");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookLabelEditedEventBuilder builder = GitHubWebhookLabelEditedEventBuilder.builder(
                        LabelCatalogFixtures.webhookLabelEditedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }

    @Test
    void constructor_shouldThrow_whenSenderNull() {
        final GitHubWebhookLabelEditedEventBuilder builder = GitHubWebhookLabelEditedEventBuilder.builder(
                        LabelCatalogFixtures.webhookLabelEditedEvent())
                .sender(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("sender");
    }
}
