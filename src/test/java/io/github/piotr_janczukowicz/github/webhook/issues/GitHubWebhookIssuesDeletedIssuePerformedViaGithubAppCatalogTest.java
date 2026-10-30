package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesDeletedIssuePerformedViaGithubAppCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesDeletedIssuePerformedViaGithubApp.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-deleted-issue-performed-via-github-app.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-deleted-issue-performed-via-github-app-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesDeletedIssuePerformedViaGithubApp();
    }
}
