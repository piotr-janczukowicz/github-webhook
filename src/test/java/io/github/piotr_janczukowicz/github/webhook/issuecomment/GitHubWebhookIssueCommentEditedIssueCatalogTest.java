package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueCommentEditedIssueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueCommentEditedIssue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-comment-edited-issue.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-comment-edited-issue-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueCommentCatalogFixtures.webhookIssueCommentEditedIssue();
    }
}
