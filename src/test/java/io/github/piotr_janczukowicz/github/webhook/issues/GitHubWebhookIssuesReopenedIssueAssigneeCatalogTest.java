package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesReopenedIssueAssigneeCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesReopenedIssueAssignee.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-reopened-issue-assignee.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-reopened-issue-assignee-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesReopenedIssueAssignee();
    }
}
