package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueAssigneeCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueAssignee.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-assignee.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-assignee-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueCommentCatalogFixtures.webhookIssueAssignee();
    }
}
