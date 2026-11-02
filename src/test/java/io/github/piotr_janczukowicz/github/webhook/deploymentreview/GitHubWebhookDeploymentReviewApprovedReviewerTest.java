package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentReviewApprovedReviewerTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookDeploymentReviewApprovedReviewer fixture =
                DeploymentReviewCatalogFixtures.webhookDeploymentReviewApprovedReviewer();

        final GitHubWebhookDeploymentReviewApprovedReviewer copy =
                GitHubWebhookDeploymentReviewApprovedReviewerBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
