package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueCommentEditedIssuePerformedViaGithubAppPermissionsCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueCommentEditedIssuePerformedViaGithubAppPermissions.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-comment-edited-issue-performed-via-github-app-permissions.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-comment-edited-issue-performed-via-github-app-permissions-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookIssueCommentEditedIssuePerformedViaGithubAppPermissions();
    }
}
