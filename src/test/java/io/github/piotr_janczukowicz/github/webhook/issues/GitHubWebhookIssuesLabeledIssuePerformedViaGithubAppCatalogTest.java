package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesLabeledIssuePerformedViaGithubAppCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesLabeledIssuePerformedViaGithubApp.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-labeled-issue-performed-via-github-app.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-labeled-issue-performed-via-github-app-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesLabeledIssuePerformedViaGithubApp();
    }
}
