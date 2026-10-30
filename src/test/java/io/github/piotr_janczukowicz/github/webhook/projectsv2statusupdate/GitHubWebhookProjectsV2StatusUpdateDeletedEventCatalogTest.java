package io.github.piotr_janczukowicz.github.webhook.projectsv2statusupdate;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectsV2StatusUpdateDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2StatusUpdateDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-projects-v2-status-update-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-status-update-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectsV2StatusUpdateCatalogFixtures.webhookProjectsV2StatusUpdateDeletedEvent();
    }
}
