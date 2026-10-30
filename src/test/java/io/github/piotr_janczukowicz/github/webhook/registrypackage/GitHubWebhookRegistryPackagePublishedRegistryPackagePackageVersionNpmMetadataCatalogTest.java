package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadataCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata.class;
    }

    @Override
    protected String fixture() {
        return "webhook-registry-package-published-registry-package-package-version-npm-metadata.json";
    }

    @Override
    protected String schema() {
        return "webhook-registry-package-published-registry-package-package-version-npm-metadata-schema.json";
    }

    @Override
    protected Object expected() {
        return RegistryPackageCatalogFixtures.webhookRegistryPackagePublishedRegistryPackagePackageVersionNpmMetadata();
    }
}
