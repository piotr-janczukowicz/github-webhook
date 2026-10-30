package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesEditedIssueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesEditedIssue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-edited-issue.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-edited-issue-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesEditedIssue();
    }
}
