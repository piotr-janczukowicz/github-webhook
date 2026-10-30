package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentReviewApprovedReviewerCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentReviewApprovedReviewer.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-review-approved-reviewer.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-review-approved-reviewer-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentReviewCatalogFixtures.webhookDeploymentReviewApprovedReviewer();
    }
}
