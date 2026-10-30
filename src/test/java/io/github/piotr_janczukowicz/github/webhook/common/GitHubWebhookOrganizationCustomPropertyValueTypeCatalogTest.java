package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookOrganizationCustomPropertyValueTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrganizationCustomPropertyValueType.class;
    }

    @Override
    protected String schema() {
        return "webhook-organization-custom-property-value-type-schema.json";
    }
}
