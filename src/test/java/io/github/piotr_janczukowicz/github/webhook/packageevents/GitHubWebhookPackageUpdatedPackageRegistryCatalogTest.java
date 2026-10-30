package io.github.piotr_janczukowicz.github.webhook.packageevents;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPackageUpdatedPackageRegistryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPackageUpdatedPackageRegistry.class;
    }

    @Override
    protected String fixture() {
        return "webhook-package-updated-package-registry.json";
    }

    @Override
    protected String schema() {
        return "webhook-package-updated-package-registry-schema.json";
    }

    @Override
    protected Object expected() {
        return PackageCatalogFixtures.webhookPackageUpdatedPackageRegistry();
    }
}
