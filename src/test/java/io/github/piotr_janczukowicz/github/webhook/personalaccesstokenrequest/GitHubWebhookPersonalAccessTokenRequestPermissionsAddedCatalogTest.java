package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPersonalAccessTokenRequestPermissionsAddedCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPersonalAccessTokenRequestPermissionsAdded.class;
    }

    @Override
    protected String fixture() {
        return "webhook-personal-access-token-request-permissions-added.json";
    }

    @Override
    protected String schema() {
        return "webhook-personal-access-token-request-permissions-added-schema.json";
    }

    @Override
    protected Object expected() {
        return PersonalAccessTokenRequestCatalogFixtures.webhookPersonalAccessTokenRequestPermissionsAdded();
    }
}
