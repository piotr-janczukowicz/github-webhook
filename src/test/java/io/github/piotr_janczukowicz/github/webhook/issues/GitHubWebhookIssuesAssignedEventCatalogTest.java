package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesAssignedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesAssignedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-assigned-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-assigned-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesAssignedEvent();
    }
}
