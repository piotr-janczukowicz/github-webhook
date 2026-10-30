package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPersonalAccessTokenRequestApprovedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPersonalAccessTokenRequestApprovedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-personal-access-token-request-approved-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-personal-access-token-request-approved-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PersonalAccessTokenRequestCatalogFixtures.webhookPersonalAccessTokenRequestApprovedEvent();
    }
}
