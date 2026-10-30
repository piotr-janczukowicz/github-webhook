package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueFieldValueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueFieldValue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-field-value.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-field-value-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookIssueFieldValue();
    }
}
