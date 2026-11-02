package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2ItemEditedChangesFieldValueValueTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookProjectsV2ItemEditedChangesFieldValueValue fixture =
                ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemEditedChangesFieldValueValue();

        final GitHubWebhookProjectsV2ItemEditedChangesFieldValueValue copy =
                GitHubWebhookProjectsV2ItemEditedChangesFieldValueValueBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
