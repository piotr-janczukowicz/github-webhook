package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueTypeCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueType.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-type.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-type-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookIssueType();
    }
}
