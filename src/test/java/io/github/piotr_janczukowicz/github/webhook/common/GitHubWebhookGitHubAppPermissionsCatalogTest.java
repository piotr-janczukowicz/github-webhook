package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookGitHubAppPermissionsCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookGitHubAppPermissions.class;
    }

    @Override
    protected String fixture() {
        return "webhook-git-hub-app-permissions.json";
    }

    @Override
    protected String schema() {
        return "webhook-git-hub-app-permissions-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookGitHubAppPermissions();
    }
}
