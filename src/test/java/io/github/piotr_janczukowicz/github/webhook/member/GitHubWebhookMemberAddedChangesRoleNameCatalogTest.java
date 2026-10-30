package io.github.piotr_janczukowicz.github.webhook.member;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMemberAddedChangesRoleNameCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMemberAddedChangesRoleName.class;
    }

    @Override
    protected String fixture() {
        return "webhook-member-added-changes-role-name.json";
    }

    @Override
    protected String schema() {
        return "webhook-member-added-changes-role-name-schema.json";
    }

    @Override
    protected Object expected() {
        return MemberCatalogFixtures.webhookMemberAddedChangesRoleName();
    }
}
