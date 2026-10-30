package io.github.piotr_janczukowicz.github.webhook.status;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookStatusCommitCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookStatusCommit.class;
    }

    @Override
    protected String fixture() {
        return "webhook-status-commit.json";
    }

    @Override
    protected String schema() {
        return "webhook-status-commit-schema.json";
    }

    @Override
    protected Object expected() {
        return StatusCatalogFixtures.webhookStatusCommit();
    }
}
