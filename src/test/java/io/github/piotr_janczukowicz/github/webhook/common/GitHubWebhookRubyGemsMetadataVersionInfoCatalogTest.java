package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRubyGemsMetadataVersionInfoCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRubyGemsMetadataVersionInfo.class;
    }

    @Override
    protected String fixture() {
        return "webhook-ruby-gems-metadata-version-info.json";
    }

    @Override
    protected String schema() {
        return "webhook-ruby-gems-metadata-version-info-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookRubyGemsMetadataVersionInfo();
    }
}
