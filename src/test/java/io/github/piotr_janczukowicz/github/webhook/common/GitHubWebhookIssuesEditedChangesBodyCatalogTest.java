package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesEditedChangesBodyCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesEditedChangesBody.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-edited-changes-body.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-edited-changes-body-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookIssuesEditedChangesBody();
    }
}
