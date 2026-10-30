package io.github.piotr_janczukowicz.github.webhook.status;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookStatusCommitValueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookStatusCommitValue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-status-commit-value.json";
    }

    @Override
    protected String schema() {
        return "webhook-status-commit-value-schema.json";
    }

    @Override
    protected Object expected() {
        return StatusCatalogFixtures.webhookStatusCommitValue();
    }
}
