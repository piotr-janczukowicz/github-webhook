package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentReviewRequestedReviewerCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentReviewRequestedReviewer.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-review-requested-reviewer.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-review-requested-reviewer-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentReviewCatalogFixtures.webhookDeploymentReviewRequestedReviewer();
    }
}
