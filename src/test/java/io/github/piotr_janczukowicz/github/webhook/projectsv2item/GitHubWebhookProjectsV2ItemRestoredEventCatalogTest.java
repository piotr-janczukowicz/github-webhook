package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectsV2ItemRestoredEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2ItemRestoredEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-projects-v2-item-restored-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-item-restored-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemRestoredEvent();
    }
}
