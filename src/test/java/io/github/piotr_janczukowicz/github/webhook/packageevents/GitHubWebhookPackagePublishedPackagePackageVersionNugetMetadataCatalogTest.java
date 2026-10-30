package io.github.piotr_janczukowicz.github.webhook.packageevents;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPackagePublishedPackagePackageVersionNugetMetadataCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPackagePublishedPackagePackageVersionNugetMetadata.class;
    }

    @Override
    protected String fixture() {
        return "webhook-package-published-package-package-version-nuget-metadata.json";
    }

    @Override
    protected String schema() {
        return "webhook-package-published-package-package-version-nuget-metadata-schema.json";
    }

    @Override
    protected Object expected() {
        return PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersionNugetMetadata();
    }
}
