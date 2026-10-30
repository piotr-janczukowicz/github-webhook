package io.github.piotr_janczukowicz.github.webhook.user;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookUserDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookUserDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-user-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-user-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return UserCatalogFixtures.webhookUserDeletedEvent();
    }
}
