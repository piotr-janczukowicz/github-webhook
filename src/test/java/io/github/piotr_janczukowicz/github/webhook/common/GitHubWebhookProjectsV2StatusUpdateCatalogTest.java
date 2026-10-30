package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectsV2StatusUpdateCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2StatusUpdate.class;
    }

    @Override
    protected String fixture() {
        return "webhook-projects-v2-status-update.json";
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-status-update-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookProjectsV2StatusUpdate();
    }
}
