package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2ItemArchivedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookProjectsV2ItemArchivedChanges fixture =
                ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemArchivedChanges();

        final GitHubWebhookProjectsV2ItemArchivedChanges copy =
                GitHubWebhookProjectsV2ItemArchivedChangesBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
