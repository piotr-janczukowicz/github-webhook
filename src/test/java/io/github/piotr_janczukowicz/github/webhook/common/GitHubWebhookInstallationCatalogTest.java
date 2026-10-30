package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookInstallationCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookInstallation.class;
    }

    @Override
    protected String fixture() {
        return "webhook-installation.json";
    }

    @Override
    protected String schema() {
        return "webhook-installation-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookInstallation();
    }
}
