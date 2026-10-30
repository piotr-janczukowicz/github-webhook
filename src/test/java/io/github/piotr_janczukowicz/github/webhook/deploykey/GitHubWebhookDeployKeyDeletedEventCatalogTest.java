package io.github.piotr_janczukowicz.github.webhook.deploykey;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeployKeyDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeployKeyDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deploy-key-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-deploy-key-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DeployKeyCatalogFixtures.webhookDeployKeyDeletedEvent();
    }
}
