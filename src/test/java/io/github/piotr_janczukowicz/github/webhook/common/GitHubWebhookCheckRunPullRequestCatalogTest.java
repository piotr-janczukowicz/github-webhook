package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCheckRunPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckRunPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-check-run-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-check-run-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookCheckRunPullRequest();
    }
}
