package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesLockedIssueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesLockedIssue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-locked-issue.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-locked-issue-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesLockedIssue();
    }
}
