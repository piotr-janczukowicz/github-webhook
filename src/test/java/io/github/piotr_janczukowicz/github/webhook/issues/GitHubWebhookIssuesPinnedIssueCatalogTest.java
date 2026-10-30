package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesPinnedIssueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesPinnedIssue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-pinned-issue.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-pinned-issue-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesPinnedIssue();
    }
}
