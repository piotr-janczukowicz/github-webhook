package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookFileExtensionRestrictionTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookFileExtensionRestrictionType.class;
    }

    @Override
    protected String schema() {
        return "webhook-file-extension-restriction-type-schema.json";
    }
}
