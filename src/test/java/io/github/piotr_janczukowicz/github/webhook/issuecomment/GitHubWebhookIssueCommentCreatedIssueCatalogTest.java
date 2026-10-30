package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueCommentCreatedIssueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueCommentCreatedIssue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-comment-created-issue.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-comment-created-issue-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssue();
    }
}
