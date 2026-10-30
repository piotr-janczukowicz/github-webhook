package io.github.piotr_janczukowicz.github.webhook.installationtarget;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookInstallationTargetRenamedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookInstallationTargetRenamedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-installation-target-renamed-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-installation-target-renamed-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return InstallationTargetCatalogFixtures.webhookInstallationTargetRenamedChanges();
    }
}
