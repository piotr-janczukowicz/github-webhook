package io.github.piotr_janczukowicz.github.webhook.organizationcustomproperty;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookOrganizationCustomPropertyDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrganizationCustomPropertyDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-organization-custom-property-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-organization-custom-property-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return OrganizationCustomPropertyCatalogFixtures.webhookOrganizationCustomPropertyDeletedEvent();
    }
}
