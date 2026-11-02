package io.github.piotr_janczukowicz.github.webhook.projectsv2statusupdate;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2StatusUpdateEditedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookProjectsV2StatusUpdateEditedChanges fixture =
                ProjectsV2StatusUpdateCatalogFixtures.webhookProjectsV2StatusUpdateEditedChanges();

        final GitHubWebhookProjectsV2StatusUpdateEditedChanges copy =
                GitHubWebhookProjectsV2StatusUpdateEditedChangesBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
