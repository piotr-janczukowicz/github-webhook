package io.github.piotr_janczukowicz.github.webhook.packageevents;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPackageUpdatedPackagePackageVersionCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPackageUpdatedPackagePackageVersion.class;
    }

    @Override
    protected String fixture() {
        return "webhook-package-updated-package-package-version.json";
    }

    @Override
    protected String schema() {
        return "webhook-package-updated-package-package-version-schema.json";
    }

    @Override
    protected Object expected() {
        return PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersion();
    }
}
