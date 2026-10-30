package io.github.piotr_janczukowicz.github.webhook.custompropertyvalues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCustomPropertyValuesUpdatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCustomPropertyValuesUpdatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-custom-property-values-updated-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-custom-property-values-updated-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CustomPropertyValuesCatalogFixtures.webhookCustomPropertyValuesUpdatedEvent();
    }
}
