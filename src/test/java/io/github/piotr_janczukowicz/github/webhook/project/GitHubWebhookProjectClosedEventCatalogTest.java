package io.github.piotr_janczukowicz.github.webhook.project;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectClosedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectClosedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-closed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-closed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCatalogFixtures.webhookProjectClosedEvent();
    }
}
