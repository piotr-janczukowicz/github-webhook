package io.github.piotr_janczukowicz.github.webhook.packageevents;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPackagePublishedPackagePackageVersionNpmMetadataCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPackagePublishedPackagePackageVersionNpmMetadata.class;
    }

    @Override
    protected String fixture() {
        return "webhook-package-published-package-package-version-npm-metadata.json";
    }

    @Override
    protected String schema() {
        return "webhook-package-published-package-package-version-npm-metadata-schema.json";
    }

    @Override
    protected Object expected() {
        return PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersionNpmMetadata();
    }
}
