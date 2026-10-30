package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRegistryPackagePublishedRegistryPackageCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRegistryPackagePublishedRegistryPackage.class;
    }

    @Override
    protected String fixture() {
        return "webhook-registry-package-published-registry-package.json";
    }

    @Override
    protected String schema() {
        return "webhook-registry-package-published-registry-package-schema.json";
    }

    @Override
    protected Object expected() {
        return RegistryPackageCatalogFixtures.webhookRegistryPackagePublishedRegistryPackage();
    }
}
