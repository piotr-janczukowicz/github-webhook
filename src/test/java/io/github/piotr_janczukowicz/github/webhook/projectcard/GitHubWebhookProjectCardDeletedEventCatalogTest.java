package io.github.piotr_janczukowicz.github.webhook.projectcard;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectCardDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectCardDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-card-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-card-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCardCatalogFixtures.webhookProjectCardDeletedEvent();
    }
}
