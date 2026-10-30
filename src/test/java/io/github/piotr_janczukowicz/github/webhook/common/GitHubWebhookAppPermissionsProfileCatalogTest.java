package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookAppPermissionsProfileCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookAppPermissionsProfile.class;
    }

    @Override
    protected String schema() {
        return "webhook-app-permissions-profile-schema.json";
    }
}
