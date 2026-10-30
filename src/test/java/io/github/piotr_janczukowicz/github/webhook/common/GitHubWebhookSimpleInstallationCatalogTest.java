package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSimpleInstallationCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSimpleInstallation.class;
    }

    @Override
    protected String fixture() {
        return "webhook-simple-installation.json";
    }

    @Override
    protected String schema() {
        return "webhook-simple-installation-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookSimpleInstallation();
    }
}
