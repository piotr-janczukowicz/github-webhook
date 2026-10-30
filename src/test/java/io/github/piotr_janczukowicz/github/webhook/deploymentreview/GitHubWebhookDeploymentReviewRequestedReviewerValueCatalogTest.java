package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentReviewRequestedReviewerValueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentReviewRequestedReviewerValue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-review-requested-reviewer-value.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-review-requested-reviewer-value-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentReviewCatalogFixtures.webhookDeploymentReviewRequestedReviewerValue();
    }
}
