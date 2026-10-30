package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueFieldValueMultiSelectOptionCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueFieldValueMultiSelectOption.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-field-value-multi-select-option.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-field-value-multi-select-option-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookIssueFieldValueMultiSelectOption();
    }
}
