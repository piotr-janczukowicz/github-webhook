package io.github.piotr_janczukowicz.github.webhook.projectcolumn;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectColumnCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectColumnCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-column-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-column-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectColumnCatalogFixtures.webhookProjectColumnCreatedEvent();
    }
}
