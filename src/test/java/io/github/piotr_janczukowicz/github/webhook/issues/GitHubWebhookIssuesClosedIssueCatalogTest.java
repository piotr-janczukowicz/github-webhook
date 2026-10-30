package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesClosedIssueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesClosedIssue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-closed-issue.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-closed-issue-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesClosedIssue();
    }
}
