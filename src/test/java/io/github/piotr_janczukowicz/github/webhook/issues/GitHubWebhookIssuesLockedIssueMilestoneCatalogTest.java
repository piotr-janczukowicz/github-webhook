package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesLockedIssueMilestoneCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesLockedIssueMilestone.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-locked-issue-milestone.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-locked-issue-milestone-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesLockedIssueMilestone();
    }
}
