package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesFieldAddedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesFieldAddedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-field-added-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-field-added-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesFieldAddedChanges();
    }
}
