package io.github.piotr_janczukowicz.github.webhook.packageevents;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPackageUpdatedPackagePackageVersionPackageFileCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPackageUpdatedPackagePackageVersionPackageFile.class;
    }

    @Override
    protected String fixture() {
        return "webhook-package-updated-package-package-version-package-file.json";
    }

    @Override
    protected String schema() {
        return "webhook-package-updated-package-package-version-package-file-schema.json";
    }

    @Override
    protected Object expected() {
        return PackageCatalogFixtures.webhookPackageUpdatedPackagePackageVersionPackageFile();
    }
}
