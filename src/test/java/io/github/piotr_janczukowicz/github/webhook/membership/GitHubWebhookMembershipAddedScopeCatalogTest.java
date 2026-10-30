package io.github.piotr_janczukowicz.github.webhook.membership;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookMembershipAddedScopeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMembershipAddedScope.class;
    }

    @Override
    protected String schema() {
        return "webhook-membership-added-scope-schema.json";
    }
}
