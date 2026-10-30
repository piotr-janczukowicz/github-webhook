package io.github.piotr_janczukowicz.github.webhook.registrypackage;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFileCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFile.class;
    }

    @Override
    protected String fixture() {
        return "webhook-registry-package-updated-registry-package-package-version-package-file.json";
    }

    @Override
    protected String schema() {
        return "webhook-registry-package-updated-registry-package-package-version-package-file-schema.json";
    }

    @Override
    protected Object expected() {
        return RegistryPackageCatalogFixtures.webhookRegistryPackageUpdatedRegistryPackagePackageVersionPackageFile();
    }
}
