package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesUnpinnedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesUnpinnedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-unpinned-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-unpinned-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesUnpinnedEvent();
    }
}
