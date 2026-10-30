package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookProjectsV2ItemContentTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2ItemContentType.class;
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-item-content-type-schema.json";
    }
}
