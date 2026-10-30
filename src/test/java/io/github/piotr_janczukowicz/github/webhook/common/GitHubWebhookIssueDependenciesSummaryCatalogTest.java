package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueDependenciesSummaryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueDependenciesSummary.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-dependencies-summary.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-dependencies-summary-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookIssueDependenciesSummary();
    }
}
