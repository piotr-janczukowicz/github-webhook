package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCheckSuiteRequestedCheckSuiteConclusionCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckSuiteRequestedCheckSuiteConclusion.class;
    }

    @Override
    protected String schema() {
        return "webhook-check-suite-requested-check-suite-conclusion-schema.json";
    }
}
