package io.github.piotr_janczukowicz.github.webhook.subissues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSubIssuesSubIssueRemovedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSubIssuesSubIssueRemovedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-sub-issues-sub-issue-removed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-sub-issues-sub-issue-removed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return SubIssuesCatalogFixtures.webhookSubIssuesSubIssueRemovedEvent();
    }
}
