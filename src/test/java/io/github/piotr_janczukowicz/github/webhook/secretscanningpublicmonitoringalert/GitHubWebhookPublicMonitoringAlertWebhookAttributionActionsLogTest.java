package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPublicMonitoringAlertWebhookAttributionActionsLogTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPublicMonitoringAlertWebhookAttributionActionsLog fixture =
                SecretScanningPublicMonitoringAlertCatalogFixtures
                        .webhookPublicMonitoringAlertWebhookAttributionActionsLog();

        final GitHubWebhookPublicMonitoringAlertWebhookAttributionActionsLog copy =
                GitHubWebhookPublicMonitoringAlertWebhookAttributionActionsLogBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
