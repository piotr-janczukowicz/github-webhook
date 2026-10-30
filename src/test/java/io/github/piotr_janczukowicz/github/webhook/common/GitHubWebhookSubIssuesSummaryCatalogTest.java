package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSubIssuesSummaryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSubIssuesSummary.class;
    }

    @Override
    protected String fixture() {
        return "webhook-sub-issues-summary.json";
    }

    @Override
    protected String schema() {
        return "webhook-sub-issues-summary-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookSubIssuesSummary();
    }
}
