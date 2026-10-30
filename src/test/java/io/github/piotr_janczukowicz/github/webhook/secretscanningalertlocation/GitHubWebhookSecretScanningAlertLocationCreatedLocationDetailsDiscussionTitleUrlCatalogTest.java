package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionTitleUrlCatalogTest
        extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionTitleUrl.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-alert-location-created-location-details-discussion-title-url.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-location-created-location-details-discussion-title-url-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertLocationCatalogFixtures
                .webhookSecretScanningAlertLocationCreatedLocationDetailsDiscussionTitleUrl();
    }
}
