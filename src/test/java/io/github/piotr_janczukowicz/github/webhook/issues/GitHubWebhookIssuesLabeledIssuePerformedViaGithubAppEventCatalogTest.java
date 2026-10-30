package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookIssuesLabeledIssuePerformedViaGithubAppEventCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesLabeledIssuePerformedViaGithubAppEvent.class;
    }

    @Override
    protected String schema() {
        return "webhook-issues-labeled-issue-performed-via-github-app-event-schema.json";
    }
}
