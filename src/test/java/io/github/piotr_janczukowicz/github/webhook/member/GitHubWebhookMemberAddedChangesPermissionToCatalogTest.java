package io.github.piotr_janczukowicz.github.webhook.member;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookMemberAddedChangesPermissionToCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMemberAddedChangesPermissionTo.class;
    }

    @Override
    protected String schema() {
        return "webhook-member-added-changes-permission-to-schema.json";
    }
}
