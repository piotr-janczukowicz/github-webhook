package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesFieldAddedIssueFieldValueOptionCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesFieldAddedIssueFieldValueOption.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-field-added-issue-field-value-option.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-field-added-issue-field-value-option-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesFieldAddedIssueFieldValueOption();
    }
}
