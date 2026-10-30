package io.github.piotr_janczukowicz.github.webhook.checksuite;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCheckSuiteRequestedCheckSuiteAppCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckSuiteRequestedCheckSuiteApp.class;
    }

    @Override
    protected String fixture() {
        return "webhook-check-suite-requested-check-suite-app.json";
    }

    @Override
    protected String schema() {
        return "webhook-check-suite-requested-check-suite-app-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedCheckSuiteApp();
    }
}
