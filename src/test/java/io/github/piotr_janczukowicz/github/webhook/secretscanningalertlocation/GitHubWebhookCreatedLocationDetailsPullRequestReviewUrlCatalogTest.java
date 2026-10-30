package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCreatedLocationDetailsPullRequestReviewUrlCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCreatedLocationDetailsPullRequestReviewUrl.class;
    }

    @Override
    protected String fixture() {
        return "webhook-created-location-details-pull-request-review-url.json";
    }

    @Override
    protected String schema() {
        return "webhook-created-location-details-pull-request-review-url-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertLocationCatalogFixtures.webhookCreatedLocationDetailsPullRequestReviewUrl();
    }
}
