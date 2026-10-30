package io.github.piotr_janczukowicz.github.webhook.checksuite;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCheckSuiteRequestedCheckSuiteAppPermissionsCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCheckSuiteRequestedCheckSuiteAppPermissions.class;
    }

    @Override
    protected String fixture() {
        return "webhook-check-suite-requested-check-suite-app-permissions.json";
    }

    @Override
    protected String schema() {
        return "webhook-check-suite-requested-check-suite-app-permissions-schema.json";
    }

    @Override
    protected Object expected() {
        return CheckSuiteCatalogFixtures.webhookCheckSuiteRequestedCheckSuiteAppPermissions();
    }
}
