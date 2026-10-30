package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersion.class;
    }

    @Override
    protected String fixture() {
        return "webhook-registry-package-updated-registry-package-package-version.json";
    }

    @Override
    protected String schema() {
        return "webhook-registry-package-updated-registry-package-package-version-schema.json";
    }

    @Override
    protected Object expected() {
        return RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackagePackageVersion();
    }
}
