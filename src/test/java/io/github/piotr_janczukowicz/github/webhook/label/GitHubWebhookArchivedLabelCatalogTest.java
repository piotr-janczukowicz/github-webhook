package io.github.piotr_janczukowicz.github.webhook.label;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookArchivedLabelCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookArchivedLabel.class;
    }

    @Override
    protected String fixture() {
        return "webhook-archived-label.json";
    }

    @Override
    protected String schema() {
        return "webhook-archived-label-schema.json";
    }

    @Override
    protected Object expected() {
        return LabelCatalogFixtures.webhookArchivedLabel();
    }
}
