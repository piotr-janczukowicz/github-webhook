package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesTransferredEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesTransferredEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-transferred-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-transferred-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesTransferredEvent();
    }
}
