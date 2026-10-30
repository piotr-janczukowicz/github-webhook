package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPersonalAccessTokenRequestCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPersonalAccessTokenRequestCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-personal-access-token-request-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-personal-access-token-request-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PersonalAccessTokenRequestCatalogFixtures.webhookPersonalAccessTokenRequestCreatedEvent();
    }
}
