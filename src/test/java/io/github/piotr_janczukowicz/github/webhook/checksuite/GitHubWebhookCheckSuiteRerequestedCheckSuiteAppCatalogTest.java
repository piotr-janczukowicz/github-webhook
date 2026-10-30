package io.github.piotr_janczukowicz.github.webhook.checksuite;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCheckSuiteRerequestedCheckSuiteAppCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckSuiteRerequestedCheckSuiteApp.class;
    }

    @Override
    protected String fixture() {
        return "webhook-check-suite-rerequested-check-suite-app.json";
    }

    @Override
    protected String schema() {
        return "webhook-check-suite-rerequested-check-suite-app-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckSuiteCatalogFixtures.webhookCheckSuiteRerequestedCheckSuiteApp();
    }
}
