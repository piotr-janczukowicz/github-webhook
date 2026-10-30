package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryTemplateRepositoryPermissionsCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryTemplateRepositoryPermissions.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-template-repository-permissions.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-template-repository-permissions-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookRepositoryTemplateRepositoryPermissions();
    }
}
