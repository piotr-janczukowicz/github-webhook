package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookLabelCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookLabel.class;
    }

    @Override
    protected String fixture() {
        return "webhook-label.json";
    }

    @Override
    protected String schema() {
        return "webhook-label-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookLabel();
    }
}
