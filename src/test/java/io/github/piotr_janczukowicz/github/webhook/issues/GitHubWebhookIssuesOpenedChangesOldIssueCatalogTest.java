package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesOpenedChangesOldIssueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesOpenedChangesOldIssue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-opened-changes-old-issue.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-opened-changes-old-issue-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesOpenedChangesOldIssue();
    }
}
