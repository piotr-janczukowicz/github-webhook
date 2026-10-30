package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPersonalAccessTokenRequestDeniedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPersonalAccessTokenRequestDeniedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-personal-access-token-request-denied-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-personal-access-token-request-denied-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PersonalAccessTokenRequestCatalogFixtures.webhookPersonalAccessTokenRequestDeniedEvent();
    }
}
