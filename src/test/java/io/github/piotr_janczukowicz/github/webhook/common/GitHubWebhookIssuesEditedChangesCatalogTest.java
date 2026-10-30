package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesEditedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesEditedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-edited-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-edited-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookIssuesEditedChanges();
    }
}
