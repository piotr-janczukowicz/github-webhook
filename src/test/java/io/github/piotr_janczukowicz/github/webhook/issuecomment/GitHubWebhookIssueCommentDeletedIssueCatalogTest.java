package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueCommentDeletedIssueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueCommentDeletedIssue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-comment-deleted-issue.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-comment-deleted-issue-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssue();
    }
}
