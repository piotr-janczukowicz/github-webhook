package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentReviewRejectedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentReviewRejectedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-review-rejected-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-review-rejected-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentReviewCatalogFixtures.webhookDeploymentReviewRejectedEvent();
    }
}
