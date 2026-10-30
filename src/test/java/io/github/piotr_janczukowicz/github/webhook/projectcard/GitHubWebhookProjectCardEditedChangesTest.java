package io.github.piotr_janczukowicz.github.webhook.projectcard;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectCardEditedChangesTest {

    @Test
    void constructor_shouldThrow_whenNoteNull() {
        final GitHubWebhookProjectCardEditedChangesBuilder builder =
                GitHubWebhookProjectCardEditedChangesBuilder.builder(
                                ProjectCardCatalogFixtures.webhookProjectCardEditedChanges())
                        .note(null);

        final Throwable thrown = catchThrowable(builder::build);

        assertThat(thrown).isInstanceOf(NullPointerException.class).hasMessageContaining("note");
    }
}
