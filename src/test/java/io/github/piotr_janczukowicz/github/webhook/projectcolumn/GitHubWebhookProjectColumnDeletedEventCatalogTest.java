package io.github.piotr_janczukowicz.github.webhook.projectcolumn;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectColumnDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectColumnDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-column-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-column-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectColumnCatalogFixtures.webhookProjectColumnDeletedEvent();
    }
}
