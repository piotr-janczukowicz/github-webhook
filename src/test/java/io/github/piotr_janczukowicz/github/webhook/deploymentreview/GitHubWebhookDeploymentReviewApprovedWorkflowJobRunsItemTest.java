package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentReviewApprovedWorkflowJobRunsItemTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookDeploymentReviewApprovedWorkflowJobRunsItem fixture =
                DeploymentReviewCatalogFixtures.webhookDeploymentReviewApprovedWorkflowJobRunsItem();

        final GitHubWebhookDeploymentReviewApprovedWorkflowJobRunsItem copy =
                GitHubWebhookDeploymentReviewApprovedWorkflowJobRunsItemBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
