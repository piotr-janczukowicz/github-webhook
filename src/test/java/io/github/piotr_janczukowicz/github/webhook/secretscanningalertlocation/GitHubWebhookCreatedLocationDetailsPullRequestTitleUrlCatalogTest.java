package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCreatedLocationDetailsPullRequestTitleUrlCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCreatedLocationDetailsPullRequestTitleUrl.class;
    }

    @Override
    protected String fixture() {
        return "webhook-created-location-details-pull-request-title-url.json";
    }

    @Override
    protected String schema() {
        return "webhook-created-location-details-pull-request-title-url-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertLocationCatalogFixtures.webhookCreatedLocationDetailsPullRequestTitleUrl();
    }
}
