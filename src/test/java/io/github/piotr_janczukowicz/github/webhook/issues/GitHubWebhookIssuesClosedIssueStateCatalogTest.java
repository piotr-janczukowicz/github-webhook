package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookIssuesClosedIssueStateCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesClosedIssueState.class;
    }

    @Override
    protected String schema() {
        return "webhook-issues-closed-issue-state-schema.json";
    }
}
