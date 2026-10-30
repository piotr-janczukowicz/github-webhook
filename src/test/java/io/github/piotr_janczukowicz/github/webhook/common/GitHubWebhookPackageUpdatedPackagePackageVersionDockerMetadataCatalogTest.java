package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPackageUpdatedPackagePackageVersionDockerMetadataCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPackageUpdatedPackagePackageVersionDockerMetadata.class;
    }

    @Override
    protected String fixture() {
        return "webhook-package-updated-package-package-version-docker-metadata.json";
    }

    @Override
    protected String schema() {
        return "webhook-package-updated-package-package-version-docker-metadata-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookPackageUpdatedPackagePackageVersionDockerMetadata();
    }
}
