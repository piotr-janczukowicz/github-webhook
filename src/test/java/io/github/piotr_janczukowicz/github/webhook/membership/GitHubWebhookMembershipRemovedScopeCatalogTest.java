package io.github.piotr_janczukowicz.github.webhook.membership;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookMembershipRemovedScopeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMembershipRemovedScope.class;
    }

    @Override
    protected String schema() {
        return "webhook-membership-removed-scope-schema.json";
    }
}
