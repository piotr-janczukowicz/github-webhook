package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPackageVersionContainerMetadataCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPackageVersionContainerMetadata.class;
    }

    @Override
    protected String fixture() {
        return "webhook-package-version-container-metadata.json";
    }

    @Override
    protected String schema() {
        return "webhook-package-version-container-metadata-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookPackageVersionContainerMetadata();
    }
}
