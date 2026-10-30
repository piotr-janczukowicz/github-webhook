package io.github.piotr_janczukowicz.github.webhook.packageevents;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPackageUpdatedPackageCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPackageUpdatedPackage.class;
    }

    @Override
    protected String fixture() {
        return "webhook-package-updated-package.json";
    }

    @Override
    protected String schema() {
        return "webhook-package-updated-package-schema.json";
    }

    @Override
    protected Object expected() {
        return PackageCatalogFixtures.webhookPackageUpdatedPackage();
    }
}
