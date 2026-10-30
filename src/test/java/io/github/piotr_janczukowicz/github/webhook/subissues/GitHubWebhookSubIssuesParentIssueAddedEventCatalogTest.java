package io.github.piotr_janczukowicz.github.webhook.subissues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSubIssuesParentIssueAddedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSubIssuesParentIssueAddedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-sub-issues-parent-issue-added-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-sub-issues-parent-issue-added-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SubIssuesCatalogFixtures.webhookSubIssuesParentIssueAddedEvent();
    }
}
