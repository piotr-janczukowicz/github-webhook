package io.github.piotr_janczukowicz.github.webhook.milestone;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMilestoneOpenedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMilestoneOpenedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-milestone-opened-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-milestone-opened-event-schema.json";
    }

    @Override
    protected Object expected() {
        return MilestoneCatalogFixtures.webhookMilestoneOpenedEvent();
    }
}
