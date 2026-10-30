package io.github.piotr_janczukowicz.github.webhook.subissues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSubIssuesSubIssueAddedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSubIssuesSubIssueAddedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-sub-issues-sub-issue-added-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-sub-issues-sub-issue-added-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SubIssuesCatalogFixtures.webhookSubIssuesSubIssueAddedEvent();
    }
}
