package io.github.piotr_janczukowicz.github.webhook.projectcolumn;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectColumnDeletedEventTest {

    @Test
    void constructor_shouldThrow_whenProjectColumnNull() {
        final GitHubWebhookProjectColumnDeletedEventBuilder builder =
                GitHubWebhookProjectColumnDeletedEventBuilder.builder(
                                ProjectColumnCatalogFixtures.webhookProjectColumnDeletedEvent())
                        .projectColumn(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("projectColumn");
    }
}
