package io.github.piotr_janczukowicz.github.webhook.checksuite;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCheckSuiteRerequestedCheckSuiteCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckSuiteRerequestedCheckSuite.class;
    }

    @Override
    protected String fixture() {
        return "webhook-check-suite-rerequested-check-suite.json";
    }

    @Override
    protected String schema() {
        return "webhook-check-suite-rerequested-check-suite-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckSuiteCatalogFixtures.webhookCheckSuiteRerequestedCheckSuite();
    }
}
