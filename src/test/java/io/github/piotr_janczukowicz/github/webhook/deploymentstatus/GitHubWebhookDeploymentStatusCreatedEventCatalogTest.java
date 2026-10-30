package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentStatusCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentStatusCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-status-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-status-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedEvent();
    }
}
