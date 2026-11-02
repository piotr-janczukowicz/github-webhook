package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookBaseGistFilesTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookBaseGistFiles fixture =
                SecretScanningPublicMonitoringAlertCatalogFixtures.webhookBaseGistFiles();

        final GitHubWebhookBaseGistFiles copy =
                GitHubWebhookBaseGistFilesBuilder.builder(fixture).build();

        assertThat(copy).isEqualTo(fixture);
    }
}
