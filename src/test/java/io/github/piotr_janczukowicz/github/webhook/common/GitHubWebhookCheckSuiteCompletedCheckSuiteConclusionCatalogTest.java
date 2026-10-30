package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCheckSuiteCompletedCheckSuiteConclusionCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckSuiteCompletedCheckSuiteConclusion.class;
    }

    @Override
    protected String schema() {
        return "webhook-check-suite-completed-check-suite-conclusion-schema.json";
    }
}
