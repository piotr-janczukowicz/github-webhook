package io.github.piotr_janczukowicz.github.webhook.projectcolumn;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectColumnEditedEventTest {

    @Test
    void constructor_shouldThrow_whenChangesNull() {
        final GitHubWebhookProjectColumnEditedEventBuilder builder =
                GitHubWebhookProjectColumnEditedEventBuilder.builder(
                                ProjectColumnCatalogFixtures.webhookProjectColumnEditedEvent())
                        .changes(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("changes");
    }

    @Test
    void constructor_shouldThrow_whenProjectColumnNull() {
        final GitHubWebhookProjectColumnEditedEventBuilder builder =
                GitHubWebhookProjectColumnEditedEventBuilder.builder(
                                ProjectColumnCatalogFixtures.webhookProjectColumnEditedEvent())
                        .projectColumn(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectColumn");
    }
}
