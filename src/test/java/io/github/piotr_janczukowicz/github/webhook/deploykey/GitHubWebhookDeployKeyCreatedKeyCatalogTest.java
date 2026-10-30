package io.github.piotr_janczukowicz.github.webhook.deploykey;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeployKeyCreatedKeyCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeployKeyCreatedKey.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deploy-key-created-key.json";
    }

    @Override
    protected String schema() {
        return "webhook-deploy-key-created-key-schema.json";
    }

    @Override
    protected Object expected() {
        return DeployKeyCatalogFixtures.webhookDeployKeyCreatedKey();
    }
}
