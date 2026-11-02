package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestBodyTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestBody fixture =
                SecretScanningPublicMonitoringAlertCatalogFixtures
                        .webhookPublicMonitoringAlertWebhookAttributionPullRequestBody();

        final GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestBody copy =
                GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestBodyBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
