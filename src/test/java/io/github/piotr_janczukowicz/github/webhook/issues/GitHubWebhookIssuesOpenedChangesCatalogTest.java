package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesOpenedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesOpenedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-opened-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-opened-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesOpenedChanges();
    }
}
