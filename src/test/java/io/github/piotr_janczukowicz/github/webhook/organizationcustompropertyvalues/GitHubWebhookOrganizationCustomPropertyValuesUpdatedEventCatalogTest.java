package io.github.piotr_janczukowicz.github.webhook.organizationcustompropertyvalues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookOrganizationCustomPropertyValuesUpdatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrganizationCustomPropertyValuesUpdatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-organization-custom-property-values-updated-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-organization-custom-property-values-updated-event-schema.json";
    }

    @Override
    protected Object expected() {
        return OrganizationCustomPropertyValuesCatalogFixtures.webhookOrganizationCustomPropertyValuesUpdatedEvent();
    }
}
