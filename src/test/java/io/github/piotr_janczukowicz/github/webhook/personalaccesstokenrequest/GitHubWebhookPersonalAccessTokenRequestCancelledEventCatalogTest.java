package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPersonalAccessTokenRequestCancelledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPersonalAccessTokenRequestCancelledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-personal-access-token-request-cancelled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-personal-access-token-request-cancelled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PersonalAccessTokenRequestCatalogFixtures.webhookPersonalAccessTokenRequestCancelledEvent();
    }
}
