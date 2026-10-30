package io.github.piotr_janczukowicz.github.webhook.checkrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCheckRunCheckSuiteCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckRunCheckSuite.class;
    }

    @Override
    protected String fixture() {
        return "webhook-check-run-check-suite.json";
    }

    @Override
    protected String schema() {
        return "webhook-check-run-check-suite-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckRunCatalogFixtures.webhookCheckRunCheckSuite();
    }
}
