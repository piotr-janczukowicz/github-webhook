package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesFieldAddedChangesIssueFieldValueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesFieldAddedChangesIssueFieldValue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-field-added-changes-issue-field-value.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-field-added-changes-issue-field-value-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesFieldAddedChangesIssueFieldValue();
    }
}
