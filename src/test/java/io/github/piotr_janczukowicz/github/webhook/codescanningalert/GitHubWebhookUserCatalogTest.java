package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookUserCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookUser.class;
    }

    @Override
    protected String fixture() {
        return "webhook-user.json";
    }

    @Override
    protected String schema() {
        return "webhook-user-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookUser();
    }
}
