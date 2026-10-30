package io.github.piotr_janczukowicz.github.webhook.release;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookReleaseAssetStateCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookReleaseAssetState.class;
    }

    @Override
    protected String schema() {
        return "webhook-release-asset-state-schema.json";
    }
}
