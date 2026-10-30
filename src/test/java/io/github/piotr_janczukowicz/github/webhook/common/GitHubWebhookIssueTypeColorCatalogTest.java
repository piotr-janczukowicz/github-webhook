package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookIssueTypeColorCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueTypeColor.class;
    }

    @Override
    protected String schema() {
        return "webhook-issue-type-color-schema.json";
    }
}
