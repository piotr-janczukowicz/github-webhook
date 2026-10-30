package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestLabelCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestLabel.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-label.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-label-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookPullRequestLabel();
    }
}
