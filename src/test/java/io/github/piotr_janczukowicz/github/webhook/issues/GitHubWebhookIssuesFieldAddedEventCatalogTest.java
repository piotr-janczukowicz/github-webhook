package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesFieldAddedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesFieldAddedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-field-added-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-field-added-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesFieldAddedEvent();
    }
}
