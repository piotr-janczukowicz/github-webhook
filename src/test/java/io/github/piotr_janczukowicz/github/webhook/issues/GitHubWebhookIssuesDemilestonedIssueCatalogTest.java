package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesDemilestonedIssueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesDemilestonedIssue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-demilestoned-issue.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-demilestoned-issue-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesDemilestonedIssue();
    }
}
