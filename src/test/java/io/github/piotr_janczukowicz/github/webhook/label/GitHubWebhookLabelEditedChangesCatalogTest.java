package io.github.piotr_janczukowicz.github.webhook.label;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookLabelEditedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookLabelEditedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-label-edited-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-label-edited-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return LabelCatalogFixtures.webhookLabelEditedChanges();
    }
}
