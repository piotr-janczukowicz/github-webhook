package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPublicMonitoringAlertWebhookAttributionWikiCommitTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPublicMonitoringAlertWebhookAttributionWikiCommit fixture =
                SecretScanningPublicMonitoringAlertCatalogFixtures
                        .webhookPublicMonitoringAlertWebhookAttributionWikiCommit();

        final GitHubWebhookPublicMonitoringAlertWebhookAttributionWikiCommit copy =
                GitHubWebhookPublicMonitoringAlertWebhookAttributionWikiCommitBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
