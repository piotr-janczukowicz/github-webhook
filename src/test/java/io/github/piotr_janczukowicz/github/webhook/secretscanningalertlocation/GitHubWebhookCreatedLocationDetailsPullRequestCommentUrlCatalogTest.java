package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCreatedLocationDetailsPullRequestCommentUrlCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCreatedLocationDetailsPullRequestCommentUrl.class;
    }

    @Override
    protected String fixture() {
        return "webhook-created-location-details-pull-request-comment-url.json";
    }

    @Override
    protected String schema() {
        return "webhook-created-location-details-pull-request-comment-url-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertLocationCatalogFixtures.webhookCreatedLocationDetailsPullRequestCommentUrl();
    }
}
