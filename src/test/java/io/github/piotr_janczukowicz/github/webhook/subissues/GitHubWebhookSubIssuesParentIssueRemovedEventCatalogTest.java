package io.github.piotr_janczukowicz.github.webhook.subissues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSubIssuesParentIssueRemovedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSubIssuesParentIssueRemovedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-sub-issues-parent-issue-removed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-sub-issues-parent-issue-removed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SubIssuesCatalogFixtures.webhookSubIssuesParentIssueRemovedEvent();
    }
}
