package io.github.piotr_janczukowicz.github.webhook.customproperty;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCustomPropertyPromoteToEnterpriseEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCustomPropertyPromoteToEnterpriseEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-custom-property-promote-to-enterprise-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-custom-property-promote-to-enterprise-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CustomPropertyCatalogFixtures.webhookCustomPropertyPromoteToEnterpriseEvent();
    }
}
