package io.github.piotr_janczukowicz.github.webhook.organizationcustomproperty;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookOrganizationCustomPropertyUpdatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrganizationCustomPropertyUpdatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-organization-custom-property-updated-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-organization-custom-property-updated-event-schema.json";
    }

    @Override
    protected Object expected() {
        return OrganizationCustomPropertyCatalogFixtures.webhookOrganizationCustomPropertyUpdatedEvent();
    }
}
