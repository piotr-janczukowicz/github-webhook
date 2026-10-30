package io.github.piotr_janczukowicz.github.webhook.projectsv2;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectsV2EditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2EditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-projects-v2-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectsV2CatalogFixtures.webhookProjectsV2EditedEvent();
    }
}
