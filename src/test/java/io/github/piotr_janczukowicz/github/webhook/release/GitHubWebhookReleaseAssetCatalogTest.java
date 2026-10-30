package io.github.piotr_janczukowicz.github.webhook.release;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookReleaseAssetCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookReleaseAsset.class;
    }

    @Override
    protected String fixture() {
        return "webhook-release-asset.json";
    }

    @Override
    protected String schema() {
        return "webhook-release-asset-schema.json";
    }

    @Override
    protected Object expected() {
        return ReleaseCatalogFixtures.webhookReleaseAsset();
    }
}
