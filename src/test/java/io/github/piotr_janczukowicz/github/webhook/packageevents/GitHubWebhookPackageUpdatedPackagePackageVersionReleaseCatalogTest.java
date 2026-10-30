package io.github.piotr_janczukowicz.github.webhook.packageevents;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPackageUpdatedPackagePackageVersionReleaseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPackageUpdatedPackagePackageVersionRelease.class;
    }

    @Override
    protected String fixture() {
        return "webhook-package-updated-package-package-version-release.json";
    }

    @Override
    protected String schema() {
        return "webhook-package-updated-package-package-version-release-schema.json";
    }

    @Override
    protected Object expected() {
        return PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersionRelease();
    }
}
