package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectsV2ItemDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2ItemDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-projects-v2-item-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-item-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemDeletedEvent();
    }
}
