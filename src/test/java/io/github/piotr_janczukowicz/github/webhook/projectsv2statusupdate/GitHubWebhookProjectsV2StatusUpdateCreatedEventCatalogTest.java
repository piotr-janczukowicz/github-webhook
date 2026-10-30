package io.github.piotr_janczukowicz.github.webhook.projectsv2statusupdate;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectsV2StatusUpdateCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2StatusUpdateCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-projects-v2-status-update-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-status-update-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectsV2StatusUpdateCatalogFixtures.webhookProjectsV2StatusUpdateCreatedEvent();
    }
}
