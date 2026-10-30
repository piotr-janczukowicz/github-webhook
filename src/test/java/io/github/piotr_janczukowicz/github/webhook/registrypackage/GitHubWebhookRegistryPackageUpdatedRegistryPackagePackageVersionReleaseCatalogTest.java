package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionReleaseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease.class;
    }

    @Override
    protected String fixture() {
        return "webhook-registry-package-updated-registry-package-package-version-release.json";
    }

    @Override
    protected String schema() {
        return "webhook-registry-package-updated-registry-package-package-version-release-schema.json";
    }

    @Override
    protected Object expected() {
        return RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackagePackageVersionRelease();
    }
}
