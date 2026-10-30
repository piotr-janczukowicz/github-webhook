package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMemberEditedChangesPermissionCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMemberEditedChangesPermission.class;
    }

    @Override
    protected String fixture() {
        return "webhook-member-edited-changes-permission.json";
    }

    @Override
    protected String schema() {
        return "webhook-member-edited-changes-permission-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookMemberEditedChangesPermission();
    }
}
