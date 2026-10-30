package io.github.piotr_janczukowicz.github.webhook.status;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCommitterCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCommitter.class;
    }

    @Override
    protected String fixture() {
        return "webhook-committer.json";
    }

    @Override
    protected String schema() {
        return "webhook-committer-schema.json";
    }

    @Override
    protected Object expected() {
        return StatusCatalogFixtures.webhookCommitter();
    }
}
