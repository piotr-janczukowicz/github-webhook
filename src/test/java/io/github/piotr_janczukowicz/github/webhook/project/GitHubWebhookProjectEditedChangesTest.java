package io.github.piotr_janczukowicz.github.webhook.project;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectEditedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookProjectEditedChanges fixture = ProjectCatalogFixtures.webhookProjectEditedChanges();

        final GitHubWebhookProjectEditedChanges copy =
                GitHubWebhookProjectEditedChangesBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
