package io.github.piotr_janczukowicz.github.webhook.project;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCatalogFixtures.webhookProjectDeletedEvent();
    }
}
