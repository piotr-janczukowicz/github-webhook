package io.github.piotr_janczukowicz.github.webhook.project;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCatalogFixtures.webhookProjectCreatedEvent();
    }
}
