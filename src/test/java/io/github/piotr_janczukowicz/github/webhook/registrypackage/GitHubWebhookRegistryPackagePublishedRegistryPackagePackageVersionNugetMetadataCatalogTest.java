package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadataCatalogTest
        extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadata.class;
    }

    @Override
    protected String fixture() {
        return "webhook-registry-package-published-registry-package-package-version-nuget-metadata.json";
    }

    @Override
    protected String schema() {
        return "webhook-registry-package-published-registry-package-package-version-nuget-metadata-schema.json";
    }

    @Override
    protected Object expected() {
        return RegistryPackageCatalogFixtures
                .webhookRegistryPackagePublishedRegistryPackagePackageVersionNugetMetadata();
    }
}
