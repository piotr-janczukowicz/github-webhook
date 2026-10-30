package io.github.piotr_janczukowicz.github.webhook.milestone;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMilestoneCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMilestoneCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-milestone-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-milestone-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return MilestoneCatalogFixtures.webhookMilestoneCreatedEvent();
    }
}
