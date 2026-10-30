package io.github.piotr_janczukowicz.github.webhook.checkrun;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCheckRunConclusionCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckRunConclusion.class;
    }

    @Override
    protected String schema() {
        return "webhook-check-run-conclusion-schema.json";
    }
}
