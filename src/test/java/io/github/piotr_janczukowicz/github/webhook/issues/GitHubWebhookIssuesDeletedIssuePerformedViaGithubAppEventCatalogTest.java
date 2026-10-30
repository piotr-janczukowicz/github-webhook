package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookIssuesDeletedIssuePerformedViaGithubAppEventCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesDeletedIssuePerformedViaGithubAppEvent.class;
    }

    @Override
    protected String schema() {
        return "webhook-issues-deleted-issue-performed-via-github-app-event-schema.json";
    }
}
