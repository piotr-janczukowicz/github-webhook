package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookIssueAssigneeTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueAssigneeType.class;
    }

    @Override
    protected String schema() {
        return "webhook-issue-assignee-type-schema.json";
    }
}
