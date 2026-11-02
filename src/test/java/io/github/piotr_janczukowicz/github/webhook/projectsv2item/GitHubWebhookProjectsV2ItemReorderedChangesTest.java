package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2ItemReorderedChangesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookProjectsV2ItemReorderedChanges fixture =
                ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemReorderedChanges();

        final GitHubWebhookProjectsV2ItemReorderedChanges copy =
                GitHubWebhookProjectsV2ItemReorderedChangesBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
