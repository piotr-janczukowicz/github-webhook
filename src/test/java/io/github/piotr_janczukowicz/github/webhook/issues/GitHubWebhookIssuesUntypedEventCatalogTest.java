package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesUntypedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesUntypedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-untyped-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-untyped-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesUntypedEvent();
    }
}
