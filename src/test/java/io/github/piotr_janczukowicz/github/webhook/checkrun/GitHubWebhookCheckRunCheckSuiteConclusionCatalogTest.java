package io.github.piotr_janczukowicz.github.webhook.checkrun;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCheckRunCheckSuiteConclusionCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckRunCheckSuiteConclusion.class;
    }

    @Override
    protected String schema() {
        return "webhook-check-run-check-suite-conclusion-schema.json";
    }
}
