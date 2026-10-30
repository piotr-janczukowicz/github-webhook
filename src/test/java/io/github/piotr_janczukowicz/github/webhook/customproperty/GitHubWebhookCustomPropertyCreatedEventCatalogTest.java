package io.github.piotr_janczukowicz.github.webhook.customproperty;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCustomPropertyCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCustomPropertyCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-custom-property-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-custom-property-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CustomPropertyCatalogFixtures.webhookCustomPropertyCreatedEvent();
    }
}
