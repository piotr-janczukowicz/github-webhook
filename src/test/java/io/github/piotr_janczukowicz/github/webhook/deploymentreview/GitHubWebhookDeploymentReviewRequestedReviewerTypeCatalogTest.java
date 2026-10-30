package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookDeploymentReviewRequestedReviewerTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentReviewRequestedReviewerType.class;
    }

    @Override
    protected String schema() {
        return "webhook-deployment-review-requested-reviewer-type-schema.json";
    }
}
