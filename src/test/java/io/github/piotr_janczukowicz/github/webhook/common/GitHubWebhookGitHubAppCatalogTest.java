package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookGitHubAppCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookGitHubApp.class;
    }

    @Override
    protected String fixture() {
        return "webhook-git-hub-app.json";
    }

    @Override
    protected String schema() {
        return "webhook-git-hub-app-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookGitHubApp();
    }
}
