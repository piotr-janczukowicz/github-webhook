package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesReopenedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesReopenedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-reopened-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-reopened-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesReopenedEvent();
    }
}
