package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRubyGemsMetadataCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRubyGemsMetadata.class;
    }

    @Override
    protected String fixture() {
        return "webhook-ruby-gems-metadata.json";
    }

    @Override
    protected String schema() {
        return "webhook-ruby-gems-metadata-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookRubyGemsMetadata();
    }
}
