package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2ItemArchivedChangesArchivedAtTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookProjectsV2ItemArchivedChangesArchivedAt fixture =
                ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemArchivedChangesArchivedAt();

        final GitHubWebhookProjectsV2ItemArchivedChangesArchivedAt copy =
                GitHubWebhookProjectsV2ItemArchivedChangesArchivedAtBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
