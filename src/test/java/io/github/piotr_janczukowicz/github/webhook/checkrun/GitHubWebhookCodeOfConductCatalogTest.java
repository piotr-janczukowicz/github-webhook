package io.github.piotr_janczukowicz.github.webhook.checkrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeOfConductCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeOfConduct.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-of-conduct.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-of-conduct-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckRunCatalogFixtures.webhookCodeOfConduct();
    }
}
