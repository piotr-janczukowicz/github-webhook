package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssue.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookIssue();
    }
}
