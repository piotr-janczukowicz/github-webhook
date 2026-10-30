package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPackageVersionContainerMetadataTagCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPackageVersionContainerMetadataTag.class;
    }

    @Override
    protected String fixture() {
        return "webhook-package-version-container-metadata-tag.json";
    }

    @Override
    protected String schema() {
        return "webhook-package-version-container-metadata-tag-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookPackageVersionContainerMetadataTag();
    }
}
