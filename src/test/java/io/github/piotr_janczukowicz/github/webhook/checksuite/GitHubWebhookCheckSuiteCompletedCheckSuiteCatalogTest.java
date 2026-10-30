package io.github.piotr_janczukowicz.github.webhook.checksuite;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCheckSuiteCompletedCheckSuiteCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckSuiteCompletedCheckSuite.class;
    }

    @Override
    protected String fixture() {
        return "webhook-check-suite-completed-check-suite.json";
    }

    @Override
    protected String schema() {
        return "webhook-check-suite-completed-check-suite-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckSuiteCatalogFixtures.webhookCheckSuiteCompletedCheckSuite();
    }
}
