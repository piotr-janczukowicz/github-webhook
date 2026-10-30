package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningAlertCreatedAlertMetadataCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertCreatedAlertMetadata.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-alert-created-alert-metadata.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-created-alert-metadata-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookSecretScanningAlertCreatedAlertMetadata();
    }
}
