package io.github.piotr_janczukowicz.github.webhook.deployment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentCatalogFixtures.webhookDeploymentCreatedEvent();
    }
}
