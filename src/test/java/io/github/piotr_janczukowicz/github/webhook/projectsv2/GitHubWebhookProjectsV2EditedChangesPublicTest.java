package io.github.piotr_janczukowicz.github.webhook.projectsv2;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookProjectsV2EditedChangesPublicTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookProjectsV2EditedChangesPublic fixture =
                ProjectsV2CatalogFixtures.webhookProjectsV2EditedChangesPublic();

        final GitHubWebhookProjectsV2EditedChangesPublic copy =
                GitHubWebhookProjectsV2EditedChangesPublicBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
