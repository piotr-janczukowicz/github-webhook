package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesEditedLabelCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesEditedLabel.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-edited-label.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-edited-label-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookIssuesEditedLabel();
    }
}
