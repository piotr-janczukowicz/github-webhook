package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentReviewApprovedReviewerValueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentReviewApprovedReviewerValue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-review-approved-reviewer-value.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-review-approved-reviewer-value-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentReviewCatalogFixtures.webhookDeploymentReviewApprovedReviewerValue();
    }
}
