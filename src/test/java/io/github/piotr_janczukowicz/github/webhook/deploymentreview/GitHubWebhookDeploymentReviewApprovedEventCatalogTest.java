package io.github.piotr_janczukowicz.github.webhook.deploymentreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentReviewApprovedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentReviewApprovedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-review-approved-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-review-approved-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentReviewCatalogFixtures.webhookDeploymentReviewApprovedEvent();
    }
}
