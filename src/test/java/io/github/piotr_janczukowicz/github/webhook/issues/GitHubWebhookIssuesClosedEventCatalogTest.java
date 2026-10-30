package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesClosedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesClosedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-closed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-closed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesClosedEvent();
    }
}
