package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesReopenedIssuePerformedViaGithubAppPermissionsCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesReopenedIssuePerformedViaGithubAppPermissions.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-reopened-issue-performed-via-github-app-permissions.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-reopened-issue-performed-via-github-app-permissions-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookIssuesReopenedIssuePerformedViaGithubAppPermissions();
    }
}
