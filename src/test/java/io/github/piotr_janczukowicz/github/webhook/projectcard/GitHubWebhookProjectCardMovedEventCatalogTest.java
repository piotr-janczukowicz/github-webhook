package io.github.piotr_janczukowicz.github.webhook.projectcard;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectCardMovedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectCardMovedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-card-moved-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-card-moved-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCardCatalogFixtures.webhookProjectCardMovedEvent();
    }
}
