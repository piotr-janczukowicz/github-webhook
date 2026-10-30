package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectsV2ItemArchivedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2ItemArchivedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-projects-v2-item-archived-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-item-archived-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemArchivedEvent();
    }
}
