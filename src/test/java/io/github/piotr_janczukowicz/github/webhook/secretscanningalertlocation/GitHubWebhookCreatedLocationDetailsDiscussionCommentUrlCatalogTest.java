package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCreatedLocationDetailsDiscussionCommentUrlCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCreatedLocationDetailsDiscussionCommentUrl.class;
    }

    @Override
    protected String fixture() {
        return "webhook-created-location-details-discussion-comment-url.json";
    }

    @Override
    protected String schema() {
        return "webhook-created-location-details-discussion-comment-url-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertLocationCatalogFixtures.webhookCreatedLocationDetailsDiscussionCommentUrl();
    }
}
