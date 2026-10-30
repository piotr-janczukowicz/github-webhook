package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRegistryPackageUpdatedRegistryPackageOwnerCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRegistryPackageUpdatedRegistryPackageOwner.class;
    }

    @Override
    protected String fixture() {
        return "webhook-registry-package-updated-registry-package-owner.json";
    }

    @Override
    protected String schema() {
        return "webhook-registry-package-updated-registry-package-owner-schema.json";
    }

    @Override
    protected Object expected() {
        return RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackageOwner();
    }
}
