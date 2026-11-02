package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentReviewRequestedReviewerTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookDeploymentReviewRequestedReviewer fixture =
                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRequestedReviewer();

        final GitHubWebhookDeploymentReviewRequestedReviewer copy =
                GitHubWebhookDeploymentReviewRequestedReviewerBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
