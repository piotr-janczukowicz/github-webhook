package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesMilestonedIssueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesMilestonedIssue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-milestoned-issue.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-milestoned-issue-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesMilestonedIssue();
    }
}
