package io.github.piotr_janczukowicz.github.webhook.customproperty;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookOrganizationCustomPropertyValuesEditableByCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrganizationCustomPropertyValuesEditableBy.class;
    }

    @Override
    protected String schema() {
        return "webhook-organization-custom-property-values-editable-by-schema.json";
    }
}
