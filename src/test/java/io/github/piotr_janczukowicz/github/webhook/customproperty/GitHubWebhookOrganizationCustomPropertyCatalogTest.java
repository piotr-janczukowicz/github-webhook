package io.github.piotr_janczukowicz.github.webhook.customproperty;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookOrganizationCustomPropertyCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrganizationCustomProperty.class;
    }

    @Override
    protected String fixture() {
        return "webhook-organization-custom-property.json";
    }

    @Override
    protected String schema() {
        return "webhook-organization-custom-property-schema.json";
    }

    @Override
    protected Object expected() {
        return CustomPropertyCatalogFixtures.webhookOrganizationCustomProperty();
    }
}
