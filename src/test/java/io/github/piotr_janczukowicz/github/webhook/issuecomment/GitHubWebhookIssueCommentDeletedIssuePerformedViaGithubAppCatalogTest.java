package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueCommentDeletedIssuePerformedViaGithubAppCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueCommentDeletedIssuePerformedViaGithubApp.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-comment-deleted-issue-performed-via-github-app.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-comment-deleted-issue-performed-via-github-app-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueCommentCatalogFixtures.webhookIssueCommentDeletedIssuePerformedViaGithubApp();
    }
}
