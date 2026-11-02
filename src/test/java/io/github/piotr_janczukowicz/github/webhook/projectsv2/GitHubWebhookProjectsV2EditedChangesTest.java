package io.github.piotr_janczukowicz.github.webhook.projectsv2;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2EditedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookProjectsV2EditedChanges fixture = ProjectsV2CatalogFixtures.webhookProjectsV2EditedChanges();

        final GitHubWebhookProjectsV2EditedChanges copy =
                GitHubWebhookProjectsV2EditedChangesBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
