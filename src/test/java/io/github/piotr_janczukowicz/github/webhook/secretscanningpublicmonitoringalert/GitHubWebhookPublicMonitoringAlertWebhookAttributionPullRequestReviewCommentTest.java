package io.github.piotr_janczukowicz.github.webhook.secretscanningpublicmonitoringalert;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestReviewCommentTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestReviewComment fixture =
                SecretScanningPublicMonitoringAlertCatalogFixtures
                        .webhookPublicMonitoringAlertWebhookAttributionPullRequestReviewComment();

        final GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestReviewComment copy =
                GitHubWebhookPublicMonitoringAlertWebhookAttributionPullRequestReviewCommentBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
