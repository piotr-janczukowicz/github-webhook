package io.github.piotr_janczukowicz.github.webhook.release;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookReleaseAuthorCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookReleaseAuthor.class;
    }

    @Override
    protected String fixture() {
        return "webhook-release-author.json";
    }

    @Override
    protected String schema() {
        return "webhook-release-author-schema.json";
    }

    @Override
    protected Object expected() {
        return ReleaseCatalogFixtures.webhookReleaseAuthor();
    }
}
