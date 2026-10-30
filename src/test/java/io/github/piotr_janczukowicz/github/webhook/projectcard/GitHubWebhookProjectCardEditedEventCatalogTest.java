package io.github.piotr_janczukowicz.github.webhook.projectcard;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectCardEditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectCardEditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-card-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-card-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCardCatalogFixtures.webhookProjectCardEditedEvent();
    }
}
