package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionBodyUrlCatalogTest
        extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionBodyUrl.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-alert-location-created-location-details-discussion-body-url.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-location-created-location-details-discussion-body-url-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertLocationCatalogFixtures
                .webhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionBodyUrl();
    }
}
