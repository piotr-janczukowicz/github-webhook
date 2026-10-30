package io.github.piotr_janczukowicz.github.webhook.organizationcustomproperty;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCustomPropertyForOrganizationValuesEditableByCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCustomPropertyForOrganizationValuesEditableBy.class;
    }

    @Override
    protected String schema() {
        return "webhook-custom-property-for-organization-values-editable-by-schema.json";
    }
}
