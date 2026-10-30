package io.github.piotr_janczukowicz.github.webhook.projectcolumn;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectColumnMovedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectColumnMovedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-column-moved-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-column-moved-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectColumnCatalogFixtures.webhookProjectColumnMovedEvent();
    }
}
