package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPublicMonitoringAlertWebhookAttributionCommitTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPublicMonitoringAlertWebhookAttributionCommit fixture =
                SecretScanningPublicMonitoringAlertCatalogFixtures
                        .webhookPublicMonitoringAlertWebhookAttributionCommit();

        final GitHubWebhookPublicMonitoringAlertWebhookAttributionCommit copy =
                GitHubWebhookPublicMonitoringAlertWebhookAttributionCommitBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
