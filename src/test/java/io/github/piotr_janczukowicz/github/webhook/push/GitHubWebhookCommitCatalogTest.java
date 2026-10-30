package io.github.piotr_janczukowicz.github.webhook.push;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCommitCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCommit.class;
    }

    @Override
    protected String fixture() {
        return "webhook-commit.json";
    }

    @Override
    protected String schema() {
        return "webhook-commit-schema.json";
    }

    @Override
    protected Object expected() {
        return PushCatalogFixtures.webhookCommit();
    }
}
