package io.github.piotr_janczukowicz.github.webhook.codescanningalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookAlertInstanceMessageCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookAlertInstanceMessage.class;
    }

    @Override
    protected String fixture() {
        return "webhook-alert-instance-message.json";
    }

    @Override
    protected String schema() {
        return "webhook-alert-instance-message-schema.json";
    }

    @Override
    protected Object expected() {
        return CodeScanningAlertCatalogFixtures.webhookAlertInstanceMessage();
    }
}
