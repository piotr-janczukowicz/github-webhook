package io.github.piotr_janczukowicz.github.webhook.status;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookStatusCommitValueTreeCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookStatusCommitValueTree.class;
    }

    @Override
    protected String fixture() {
        return "webhook-status-commit-value-tree.json";
    }

    @Override
    protected String schema() {
        return "webhook-status-commit-value-tree-schema.json";
    }

    @Override
    protected Object expected() {
        return StatusCatalogFixtures.webhookStatusCommitValueTree();
    }
}
