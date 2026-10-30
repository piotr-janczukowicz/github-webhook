package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertFixedAlertDependencyPackageCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertFixedAlertDependencyPackage.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-fixed-alert-dependency-package.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-fixed-alert-dependency-package-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookDependabotAlertFixedAlertDependencyPackage();
    }
}
