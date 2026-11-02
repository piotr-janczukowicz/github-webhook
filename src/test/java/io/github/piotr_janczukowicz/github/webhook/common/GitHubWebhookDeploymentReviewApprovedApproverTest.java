package io.github.piotr_janczukowicz.github.webhook.common;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.piotr_janczukowicz.testsupport.UnitTest;
import org.junit.jupiter.api.Test;

@UnitTest
class GitHubWebhookDeploymentReviewApprovedApproverTest {

    @Test
    void build_shouldCopyTheFixture() {
        final GitHubWebhookDeploymentReviewApprovedApprover fixture =
                CommonCatalogFixtures.webhookDeploymentReviewApprovedApprover();

        final GitHubWebhookDeploymentReviewApprovedApprover copy =
                GitHubWebhookDeploymentReviewApprovedApproverBuilder.builder(fixture)
                        .build();

        assertThat(copy).isEqualTo(fixture);
    }
}
