package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectCardEditedChangesNoteTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookProjectCardEditedChangesNote fixture =
                CommonCatalogFixtures.webhookProjectCardEditedChangesNote();

        final GitHubWebhookProjectCardEditedChangesNote copy = GitHubWebhookProjectCardEditedChangesNoteBuilder.builder(
                        fixture)
                .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
