package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookIssuesLockedIssuePerformedViaGithubAppEventCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesLockedIssuePerformedViaGithubAppEvent.class;
    }

    @Override
    protected String schema() {
        return "webhook-issues-locked-issue-performed-via-github-app-event-schema.json";
    }
}
