package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2ItemConvertedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookProjectsV2ItemConvertedChanges fixture =
                ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemConvertedChanges();

        final GitHubWebhookProjectsV2ItemConvertedChanges copy =
                GitHubWebhookProjectsV2ItemConvertedChangesBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
