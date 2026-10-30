package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCustomPropertyValueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCustomPropertyValue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-custom-property-value.json";
    }

    @Override
    protected String schema() {
        return "webhook-custom-property-value-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookCustomPropertyValue();
    }
}
