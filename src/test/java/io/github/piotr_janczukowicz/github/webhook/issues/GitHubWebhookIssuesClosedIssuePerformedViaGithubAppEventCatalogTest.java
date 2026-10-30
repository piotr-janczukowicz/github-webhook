package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookIssuesClosedIssuePerformedViaGithubAppEventCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesClosedIssuePerformedViaGithubAppEvent.class;
    }

    @Override
    protected String schema() {
        return "webhook-issues-closed-issue-performed-via-github-app-event-schema.json";
    }
}
