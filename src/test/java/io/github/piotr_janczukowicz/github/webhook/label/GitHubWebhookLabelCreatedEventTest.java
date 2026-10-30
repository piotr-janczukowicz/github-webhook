package io.github.piotr_janczukowicz.github.webhook.label;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookLabelCreatedEventTest {

    @Test
    void constructor_shouldThrow_whenLabelNull() {
        final GitHubWebhookLabelCreatedEventBuilder builder = GitHubWebhookLabelCreatedEventBuilder.builder(
                        LabelCatalogFixtures.webhookLabelCreatedEvent())
                .label(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("label");
    }

    @Test
    void constructor_shouldThrow_whenRepositoryNull() {
        final GitHubWebhookLabelCreatedEventBuilder builder = GitHubWebhookLabelCreatedEventBuilder.builder(
                        LabelCatalogFixtures.webhookLabelCreatedEvent())
                .repository(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("repository");
    }
}
