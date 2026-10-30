package io.github.piotr_janczukowicz.github.webhook.customproperty;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCustomPropertyUpdatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCustomPropertyUpdatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-custom-property-updated-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-custom-property-updated-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CustomPropertyCatalogFixtures.webhookCustomPropertyUpdatedEvent();
    }
}
