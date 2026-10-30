package io.github.piotr_janczukowicz.github.webhook.projectsv2;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectsV2DeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2DeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-projects-v2-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectsV2CatalogFixtures.webhookProjectsV2DeletedEvent();
    }
}
