package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPublicMonitoringAlertWebhookAttributionTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPublicMonitoringAlertWebhookAttribution fixture =
                SecretScanningPublicMonitoringAlertCatalogFixtures.webhookPublicMonitoringAlertWebhookAttribution();

        final GitHubWebhookPublicMonitoringAlertWebhookAttribution copy =
                GitHubWebhookPublicMonitoringAlertWebhookAttributionBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
