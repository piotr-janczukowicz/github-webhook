package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPublicMonitoringAlertWebhookRepositoryTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPublicMonitoringAlertWebhookRepository fixture =
                SecretScanningPublicMonitoringAlertCatalogFixtures.webhookPublicMonitoringAlertWebhookRepository();

        final GitHubWebhookPublicMonitoringAlertWebhookRepository copy =
                GitHubWebhookPublicMonitoringAlertWebhookRepositoryBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
