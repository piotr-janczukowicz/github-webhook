package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookDeploymentReviewApprovedReviewerTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentReviewApprovedReviewerType.class;
    }

    @Override
    protected String schema() {
        return "webhook-deployment-review-approved-reviewer-type-schema.json";
    }
}
