package io.github.piotr_janczukowicz.github.webhook.milestone;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMilestoneEditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMilestoneEditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-milestone-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-milestone-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return MilestoneCatalogFixtures.webhookMilestoneEditedEvent();
    }
}
