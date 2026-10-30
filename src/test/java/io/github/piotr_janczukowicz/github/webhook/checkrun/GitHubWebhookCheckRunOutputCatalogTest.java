package io.github.piotr_janczukowicz.github.webhook.checkrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCheckRunOutputCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckRunOutput.class;
    }

    @Override
    protected String fixture() {
        return "webhook-check-run-output.json";
    }

    @Override
    protected String schema() {
        return "webhook-check-run-output-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckRunCatalogFixtures.webhookCheckRunOutput();
    }
}
