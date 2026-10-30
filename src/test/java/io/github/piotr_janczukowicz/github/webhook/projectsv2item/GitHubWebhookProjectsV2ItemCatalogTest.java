package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectsV2ItemCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2Item.class;
    }

    @Override
    protected String fixture() {
        return "webhook-projects-v2-item.json";
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-item-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectsV2ItemCatalogFixtures.webhookProjectsV2Item();
    }
}
