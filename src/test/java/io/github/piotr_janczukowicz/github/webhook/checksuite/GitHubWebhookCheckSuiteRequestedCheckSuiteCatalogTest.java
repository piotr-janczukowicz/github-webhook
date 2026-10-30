package io.github.piotr_janczukowicz.github.webhook.checksuite;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCheckSuiteRequestedCheckSuiteCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckSuiteRequestedCheckSuite.class;
    }

    @Override
    protected String fixture() {
        return "webhook-check-suite-requested-check-suite.json";
    }

    @Override
    protected String schema() {
        return "webhook-check-suite-requested-check-suite-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedCheckSuite();
    }
}
