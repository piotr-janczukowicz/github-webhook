package io.github.piotr_janczukowicz.github.webhook.user;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookUserCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookUserCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-user-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-user-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return UserCatalogFixtures.webhookUserCreatedEvent();
    }
}
