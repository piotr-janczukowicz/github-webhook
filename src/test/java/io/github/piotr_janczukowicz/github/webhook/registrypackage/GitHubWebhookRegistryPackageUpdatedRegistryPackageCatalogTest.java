package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRegistryPackageUpdatedRegistryPackageCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRegistryPackageUpdatedRegistryPackage.class;
    }

    @Override
    protected String fixture() {
        return "webhook-registry-package-updated-registry-package.json";
    }

    @Override
    protected String schema() {
        return "webhook-registry-package-updated-registry-package-schema.json";
    }

    @Override
    protected Object expected() {
        return RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackage();
    }
}
