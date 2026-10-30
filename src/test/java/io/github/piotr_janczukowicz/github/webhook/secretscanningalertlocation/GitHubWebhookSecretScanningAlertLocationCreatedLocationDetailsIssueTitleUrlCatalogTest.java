package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueTitleUrlCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueTitleUrl.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-alert-location-created-location-details-issue-title-url.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-location-created-location-details-issue-title-url-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertLocationCatalogFixtures
                .webhookSecretScanningAlertLocationCreatedLocationDetailsIssueTitleUrl();
    }
}
