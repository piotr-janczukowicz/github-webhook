package io.github.piotr_janczukowicz.github.webhook.checkrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeployment.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckRunCatalogFixtures.webhookDeployment();
    }
}
