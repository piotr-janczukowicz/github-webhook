package io.github.piotr_janczukowicz.github.webhook.project;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectEditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectEditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCatalogFixtures.webhookProjectEditedEvent();
    }
}
