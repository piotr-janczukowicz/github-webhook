package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookAppPermissionsCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookAppPermissions.class;
    }

    @Override
    protected String fixture() {
        return "webhook-app-permissions.json";
    }

    @Override
    protected String schema() {
        return "webhook-app-permissions-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueCommentCatalogFixtures.webhookAppPermissions();
    }
}
