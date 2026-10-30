package io.github.piotr_janczukowicz.github.webhook.projectcard;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectCardConvertedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectCardConvertedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-card-converted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-card-converted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCardCatalogFixtures.webhookProjectCardConvertedEvent();
    }
}
