package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesDeletedIssueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesDeletedIssue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-deleted-issue.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-deleted-issue-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesDeletedIssue();
    }
}
