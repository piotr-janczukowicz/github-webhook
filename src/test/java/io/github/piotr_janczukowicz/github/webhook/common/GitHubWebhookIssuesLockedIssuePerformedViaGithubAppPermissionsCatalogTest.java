package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesLockedIssuePerformedViaGithubAppPermissionsCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesLockedIssuePerformedViaGithubAppPermissions.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-locked-issue-performed-via-github-app-permissions.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-locked-issue-performed-via-github-app-permissions-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookIssuesLockedIssuePerformedViaGithubAppPermissions();
    }
}
