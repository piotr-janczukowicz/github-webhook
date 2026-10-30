package io.github.piotr_janczukowicz.github.webhook.member;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMemberAddedChangesPermissionCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMemberAddedChangesPermission.class;
    }

    @Override
    protected String fixture() {
        return "webhook-member-added-changes-permission.json";
    }

    @Override
    protected String schema() {
        return "webhook-member-added-changes-permission-schema.json";
    }

    @Override
    protected Object expected() {
        return MemberCatalogFixtures.webhookMemberAddedChangesPermission();
    }
}
