package io.github.piotr_janczukowicz.github.webhook.packageevents;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPackagePublishedPackagePackageVersionCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPackagePublishedPackagePackageVersion.class;
    }

    @Override
    protected String fixture() {
        return "webhook-package-published-package-package-version.json";
    }

    @Override
    protected String schema() {
        return "webhook-package-published-package-package-version-schema.json";
    }

    @Override
    protected Object expected() {
        return PackageCatalogFixtures.webhookPackagePublishedPackagePackageVersion();
    }
}
