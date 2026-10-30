package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesEditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesEditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesEditedEvent();
    }
}
