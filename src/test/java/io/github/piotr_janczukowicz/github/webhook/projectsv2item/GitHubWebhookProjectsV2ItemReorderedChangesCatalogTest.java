package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectsV2ItemReorderedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2ItemReorderedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-projects-v2-item-reordered-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-item-reordered-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemReorderedChanges();
    }
}
