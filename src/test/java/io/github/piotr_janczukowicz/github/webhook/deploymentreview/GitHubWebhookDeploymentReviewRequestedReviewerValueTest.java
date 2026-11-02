package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentReviewRequestedReviewerValueTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookDeploymentReviewRequestedReviewerValue fixture =
                DeploymentReviewCatalogFixtures.webhookDeploymentReviewRequestedReviewerValue();

        final GitHubWebhookDeploymentReviewRequestedReviewerValue copy =
                GitHubWebhookDeploymentReviewRequestedReviewerValueBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
