package io.github.piotr_janczukowicz.github.webhook.status;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookStatusBranchCommitCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookStatusBranchCommit.class;
    }

    @Override
    protected String fixture() {
        return "webhook-status-branch-commit.json";
    }

    @Override
    protected String schema() {
        return "webhook-status-branch-commit-schema.json";
    }

    @Override
    protected Object expected() {
        return StatusCatalogFixtures.webhookStatusBranchCommit();
    }
}
