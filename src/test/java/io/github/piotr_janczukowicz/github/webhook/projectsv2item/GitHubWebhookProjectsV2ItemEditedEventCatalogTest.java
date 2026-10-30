package io.github.piotr_janczukowicz.github.webhook.projectsv2item;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectsV2ItemEditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectsV2ItemEditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-projects-v2-item-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-projects-v2-item-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectsV2ItemCatalogFixtures.webhookProjectsV2ItemEditedEvent();
    }
}
