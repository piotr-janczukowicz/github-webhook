package io.github.piotr_janczukowicz.github.webhook.customproperty;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCustomPropertyDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCustomPropertyDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-custom-property-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-custom-property-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CustomPropertyCatalogFixtures.webhookCustomPropertyDeletedEvent();
    }
}
