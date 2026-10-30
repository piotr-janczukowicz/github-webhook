package io.github.piotr_janczukowicz.github.webhook.release;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookReleaseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRelease.class;
    }

    @Override
    protected String fixture() {
        return "webhook-release.json";
    }

    @Override
    protected String schema() {
        return "webhook-release-schema.json";
    }

    @Override
    protected Object expected() {
        return ReleaseCatalogFixtures.webhookRelease();
    }
}
