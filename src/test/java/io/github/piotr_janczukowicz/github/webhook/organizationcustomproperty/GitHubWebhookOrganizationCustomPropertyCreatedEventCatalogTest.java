package io.github.piotr_janczukowicz.github.webhook.organizationcustomproperty;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookOrganizationCustomPropertyCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrganizationCustomPropertyCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-organization-custom-property-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-organization-custom-property-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return OrganizationCustomPropertyCatalogFixtures.webhookOrganizationCustomPropertyCreatedEvent();
    }
}
