package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesLabeledIssueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesLabeledIssue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-labeled-issue.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-labeled-issue-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesLabeledIssue();
    }
}
