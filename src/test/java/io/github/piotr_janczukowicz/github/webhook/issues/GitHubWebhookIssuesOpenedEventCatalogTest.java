package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesOpenedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesOpenedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-opened-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-opened-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesOpenedEvent();
    }
}
