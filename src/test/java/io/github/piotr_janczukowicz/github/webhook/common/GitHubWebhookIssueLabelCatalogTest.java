package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueLabelCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueLabel.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-label.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-label-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookIssueLabel();
    }
}
