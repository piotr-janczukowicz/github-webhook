package io.github.piotr_janczukowicz.github.webhook.project;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectReopenedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectReopenedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-reopened-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-reopened-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCatalogFixtures.webhookProjectReopenedEvent();
    }
}
