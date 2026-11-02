package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentWorkflowRunHeadRepositoryTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookDeploymentWorkflowRunHeadRepository fixture =
                DeploymentReviewCatalogFixtures.webhookDeploymentWorkflowRunHeadRepository();

        final GitHubWebhookDeploymentWorkflowRunHeadRepository copy =
                GitHubWebhookDeploymentWorkflowRunHeadRepositoryBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
