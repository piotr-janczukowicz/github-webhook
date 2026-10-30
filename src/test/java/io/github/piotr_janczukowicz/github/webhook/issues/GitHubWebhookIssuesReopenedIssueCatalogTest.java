package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesReopenedIssueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesReopenedIssue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-reopened-issue.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-reopened-issue-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesReopenedIssue();
    }
}
