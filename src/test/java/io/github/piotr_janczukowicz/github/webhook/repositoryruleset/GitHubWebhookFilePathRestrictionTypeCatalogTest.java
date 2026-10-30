package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookFilePathRestrictionTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookFilePathRestrictionType.class;
    }

    @Override
    protected String schema() {
        return "webhook-file-path-restriction-type-schema.json";
    }
}
