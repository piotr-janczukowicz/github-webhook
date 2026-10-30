package io.github.piotr_janczukowicz.github.webhook.organizationcustomproperty;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCustomPropertyForOrganizationCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCustomPropertyForOrganization.class;
    }

    @Override
    protected String fixture() {
        return "webhook-custom-property-for-organization.json";
    }

    @Override
    protected String schema() {
        return "webhook-custom-property-for-organization-schema.json";
    }

    @Override
    protected Object expected() {
        return OrganizationCustomPropertyCatalogFixtures.webhookCustomPropertyForOrganization();
    }
}
