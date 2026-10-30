package io.github.piotr_janczukowicz.github.webhook.secretscanningalertlocation;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueCommentUrlCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningAlertLocationCreatedLocationDetailsIssueCommentUrl.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-alert-location-created-location-details-issue-comment-url.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-alert-location-created-location-details-issue-comment-url-schema.json";
    }

    @Override
    protected Object expected() {
        return SecretScanningAlertLocationCatalogFixtures
                .webhookSecretScanningAlertLocationCreatedLocationDetailsIssueCommentUrl();
    }
}
