package io.github.piotr_janczukowicz.github.webhook.checkrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCheckRunRequestedActionValueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckRunRequestedActionValue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-check-run-requested-action-value.json";
    }

    @Override
    protected String schema() {
        return "webhook-check-run-requested-action-value-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckRunCatalogFixtures.webhookCheckRunRequestedActionValue();
    }
}
