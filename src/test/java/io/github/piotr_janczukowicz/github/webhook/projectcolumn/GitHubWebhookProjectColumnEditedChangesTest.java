package io.github.piotr_janczukowicz.github.webhook.projectcolumn;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectColumnEditedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookProjectColumnEditedChanges fixture =
                ProjectColumnCatalogFixtures.webhookProjectColumnEditedChanges();

        final GitHubWebhookProjectColumnEditedChanges copy =
                GitHubWebhookProjectColumnEditedChangesBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
