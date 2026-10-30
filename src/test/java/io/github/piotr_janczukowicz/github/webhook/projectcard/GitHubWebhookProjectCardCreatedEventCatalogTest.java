package io.github.piotr_janczukowicz.github.webhook.projectcard;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectCardCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectCardCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-card-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-card-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCardCatalogFixtures.webhookProjectCardCreatedEvent();
    }
}
