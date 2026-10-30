package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryPermissionsCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryPermissions.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-permissions.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-permissions-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookRepositoryPermissions();
    }
}
