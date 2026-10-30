package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesPinnedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesPinnedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-pinned-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-pinned-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesPinnedEvent();
    }
}
