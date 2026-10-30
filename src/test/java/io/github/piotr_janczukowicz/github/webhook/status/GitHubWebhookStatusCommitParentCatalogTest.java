package io.github.piotr_janczukowicz.github.webhook.status;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookStatusCommitParentCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookStatusCommitParent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-status-commit-parent.json";
    }

    @Override
    protected String schema() {
        return "webhook-status-commit-parent-schema.json";
    }

    @Override
    protected Object expected() {
        return StatusCatalogFixtures.webhookStatusCommitParent();
    }
}
