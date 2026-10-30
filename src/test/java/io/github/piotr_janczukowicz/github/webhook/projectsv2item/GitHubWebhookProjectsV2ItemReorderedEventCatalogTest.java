package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectsV2ItemReorderedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2ItemReorderedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-projects-v2-item-reordered-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-item-reordered-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemReorderedEvent();
    }
}
