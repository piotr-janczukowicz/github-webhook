package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesOpenedIssueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesOpenedIssue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-opened-issue.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-opened-issue-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesOpenedIssue();
    }
}
