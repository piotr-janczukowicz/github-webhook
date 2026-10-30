package io.github.piotr_janczukowicz.github.webhook.milestone;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMilestoneClosedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMilestoneClosedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-milestone-closed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-milestone-closed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return MilestoneCatalogFixtures.webhookMilestoneClosedEvent();
    }
}
