package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentReviewRejectedWorkflowJobRunTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookDeploymentReviewRejectedWorkflowJobRun fixture =
                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedWorkflowJobRun();

        final GitHubWebhookDeploymentReviewRejectedWorkflowJobRun copy =
                GitHubWebhookDeploymentReviewRejectedWorkflowJobRunBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
