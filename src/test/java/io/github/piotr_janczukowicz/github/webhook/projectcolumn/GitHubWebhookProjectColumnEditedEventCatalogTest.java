package io.github.piotr_janczukowicz.github.webhook.projectcolumn;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectColumnEditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectColumnEditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-column-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-column-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectColumnCatalogFixtures.webhookProjectColumnEditedEvent();
    }
}
