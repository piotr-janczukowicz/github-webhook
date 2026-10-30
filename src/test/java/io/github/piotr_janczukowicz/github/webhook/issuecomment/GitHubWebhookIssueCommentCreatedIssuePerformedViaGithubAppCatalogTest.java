package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubApp.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-comment-created-issue-performed-via-github-app.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-comment-created-issue-performed-via-github-app-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueCommentCatalogFixtures.webhookIssueCommentCreatedIssuePerformedViaGithubApp();
    }
}
