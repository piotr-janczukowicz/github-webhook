package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookOrganizationCustomPropertySourceTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookOrganizationCustomPropertySourceType.class;
    }

    @Override
    protected String schema() {
        return "webhook-organization-custom-property-source-type-schema.json";
    }
}
