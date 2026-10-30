package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuePullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuePullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookIssuePullRequest();
    }
}
