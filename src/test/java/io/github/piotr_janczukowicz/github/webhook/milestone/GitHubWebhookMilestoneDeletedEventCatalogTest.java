package io.github.piotr_janczukowicz.github.webhook.milestone;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMilestoneDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMilestoneDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-milestone-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-milestone-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return MilestoneCatalogFixtures.webhookMilestoneDeletedEvent();
    }
}
