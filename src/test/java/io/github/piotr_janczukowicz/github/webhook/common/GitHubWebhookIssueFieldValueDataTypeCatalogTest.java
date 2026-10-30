package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookIssueFieldValueDataTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueFieldValueDataType.class;
    }

    @Override
    protected String schema() {
        return "webhook-issue-field-value-data-type-schema.json";
    }
}
