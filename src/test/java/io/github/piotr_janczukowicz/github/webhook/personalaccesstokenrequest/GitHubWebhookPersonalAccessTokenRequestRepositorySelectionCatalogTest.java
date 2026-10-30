package io.github.piotr_janczukowicz.github.webhook.personalaccesstokenrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookPersonalAccessTokenRequestRepositorySelectionCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPersonalAccessTokenRequestRepositorySelection.class;
    }

    @Override
    protected String schema() {
        return "webhook-personal-access-token-request-repository-selection-schema.json";
    }
}
