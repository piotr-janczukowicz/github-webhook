package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookMilestoneStateCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMilestoneState.class;
    }

    @Override
    protected String schema() {
        return "webhook-milestone-state-schema.json";
    }
}
