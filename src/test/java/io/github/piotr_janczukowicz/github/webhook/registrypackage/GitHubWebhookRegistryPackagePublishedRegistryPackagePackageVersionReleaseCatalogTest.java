package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionReleaseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRegistryPackagePublishedRegistryPackagePackageVersionRelease.class;
    }

    @Override
    protected String fixture() {
        return "webhook-registry-package-published-registry-package-package-version-release.json";
    }

    @Override
    protected String schema() {
        return "webhook-registry-package-published-registry-package-package-version-release-schema.json";
    }

    @Override
    protected Object expected() {
        return RegistryPackageCatalogFixtures.webhookRegistryPackagePublishedRegistryPackagePackageVersionRelease();
    }
}
