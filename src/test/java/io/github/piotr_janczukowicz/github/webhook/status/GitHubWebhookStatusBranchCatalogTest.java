package io.github.piotr_janczukowicz.github.webhook.status;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookStatusBranchCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookStatusBranch.class;
    }

    @Override
    protected String fixture() {
        return "webhook-status-branch.json";
    }

    @Override
    protected String schema() {
        return "webhook-status-branch-schema.json";
    }

    @Override
    protected Object expected() {
        return StatusCatalogFixtures.webhookStatusBranch();
    }
}
