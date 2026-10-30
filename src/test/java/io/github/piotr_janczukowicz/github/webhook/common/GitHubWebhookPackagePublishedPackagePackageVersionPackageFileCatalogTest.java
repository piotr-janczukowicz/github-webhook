package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPackagePublishedPackagePackageVersionPackageFileCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPackagePublishedPackagePackageVersionPackageFile.class;
    }

    @Override
    protected String fixture() {
        return "webhook-package-published-package-package-version-package-file.json";
    }

    @Override
    protected String schema() {
        return "webhook-package-published-package-package-version-package-file-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookPackagePublishedPackagePackageVersionPackageFile();
    }
}
