package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentReviewRequestedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentReviewRequestedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-review-requested-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-review-requested-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentReviewCatalogFixtures.webhookDeploymentReviewRequestedEvent();
    }
}
