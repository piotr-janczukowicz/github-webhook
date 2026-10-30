package io.github.piotr_janczukowicz.github.webhook.deploykey;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeployKeyCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeployKeyCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deploy-key-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-deploy-key-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DeployKeyCatalogFixtures.webhookDeployKeyCreatedEvent();
    }
}
