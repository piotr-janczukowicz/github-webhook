package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookProjectsV2StatusUpdateStatusCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2StatusUpdateStatus.class;
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-status-update-status-schema.json";
    }
}
