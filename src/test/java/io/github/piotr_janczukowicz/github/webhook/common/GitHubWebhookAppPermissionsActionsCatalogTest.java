package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookAppPermissionsActionsCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookAppPermissionsActions.class;
    }

    @Override
    protected String schema() {
        return "webhook-app-permissions-actions-schema.json";
    }
}
