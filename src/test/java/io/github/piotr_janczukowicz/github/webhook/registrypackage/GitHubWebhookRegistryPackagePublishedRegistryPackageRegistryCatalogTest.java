package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRegistryPackagePublishedRegistryPackageRegistryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRegistryPackagePublishedRegistryPackageRegistry.class;
    }

    @Override
    protected String fixture() {
        return "webhook-registry-package-published-registry-package-registry.json";
    }

    @Override
    protected String schema() {
        return "webhook-registry-package-published-registry-package-registry-schema.json";
    }

    @Override
    protected Object expected() {
        return RegistryPackageCatalogFixtures.webhookRegistryPackagePublishedRegistryPackageRegistry();
    }
}
