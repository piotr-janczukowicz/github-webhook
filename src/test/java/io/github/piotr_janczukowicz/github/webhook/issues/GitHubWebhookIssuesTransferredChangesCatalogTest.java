package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesTransferredChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesTransferredChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-transferred-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-transferred-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesTransferredChanges();
    }
}
