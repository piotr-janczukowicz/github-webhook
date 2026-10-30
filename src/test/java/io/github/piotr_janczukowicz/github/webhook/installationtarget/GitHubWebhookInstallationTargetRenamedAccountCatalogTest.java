package io.github.piotr_janczukowicz.github.webhook.installationtarget;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookInstallationTargetRenamedAccountCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookInstallationTargetRenamedAccount.class;
    }

    @Override
    protected String fixture() {
        return "webhook-installation-target-renamed-account.json";
    }

    @Override
    protected String schema() {
        return "webhook-installation-target-renamed-account-schema.json";
    }

    @Override
    protected Object expected() {
        return InstallationTargetCatalogFixtures.webhookInstallationTargetRenamedAccount();
    }
}
