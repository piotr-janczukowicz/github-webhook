package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPersonalAccessTokenRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPersonalAccessTokenRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-personal-access-token-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-personal-access-token-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PersonalAccessTokenRequestCatalogFixtures.webhookPersonalAccessTokenRequest();
    }
}
