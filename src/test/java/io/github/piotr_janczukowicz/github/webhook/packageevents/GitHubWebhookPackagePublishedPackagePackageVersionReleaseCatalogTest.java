package io.github.piotr_janczukowicz.github.webhook.packageevents;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPackagePublishedPackagePackageVersionReleaseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPackagePublishedPackagePackageVersionRelease.class;
    }

    @Override
    protected String fixture() {
        return "webhook-package-published-package-package-version-release.json";
    }

    @Override
    protected String schema() {
        return "webhook-package-published-package-package-version-release-schema.json";
    }

    @Override
    protected Object expected() {
        return PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersionRelease();
    }
}
