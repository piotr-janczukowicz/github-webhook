package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesDeletedEvent();
    }
}
