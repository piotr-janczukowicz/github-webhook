package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesUnassignedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesUnassignedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-unassigned-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-unassigned-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesUnassignedEvent();
    }
}
