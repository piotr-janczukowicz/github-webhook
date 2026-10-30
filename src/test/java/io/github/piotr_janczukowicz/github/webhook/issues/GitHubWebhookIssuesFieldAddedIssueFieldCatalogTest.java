package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesFieldAddedIssueFieldCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesFieldAddedIssueField.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-field-added-issue-field.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-field-added-issue-field-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesFieldAddedIssueField();
    }
}
