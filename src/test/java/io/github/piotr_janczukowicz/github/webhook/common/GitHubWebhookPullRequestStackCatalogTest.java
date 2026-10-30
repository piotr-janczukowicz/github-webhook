package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestStackCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestStack.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-stack.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-stack-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookPullRequestStack();
    }
}
