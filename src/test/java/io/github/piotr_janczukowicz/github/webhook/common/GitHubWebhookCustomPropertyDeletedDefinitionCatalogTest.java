package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCustomPropertyDeletedDefinitionCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCustomPropertyDeletedDefinition.class;
    }

    @Override
    protected String fixture() {
        return "webhook-custom-property-deleted-definition.json";
    }

    @Override
    protected String schema() {
        return "webhook-custom-property-deleted-definition-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookCustomPropertyDeletedDefinition();
    }
}
