package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookIssuesFieldAddedIssueFieldFieldTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesFieldAddedIssueFieldFieldType.class;
    }

    @Override
    protected String schema() {
        return "webhook-issues-field-added-issue-field-field-type-schema.json";
    }
}
