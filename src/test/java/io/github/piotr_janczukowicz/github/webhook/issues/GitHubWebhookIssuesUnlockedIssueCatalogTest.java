package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesUnlockedIssueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesUnlockedIssue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-unlocked-issue.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-unlocked-issue-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesUnlockedIssue();
    }
}
