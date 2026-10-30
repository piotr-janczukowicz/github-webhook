package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertDismissalRequestDataCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertDismissalRequestData.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-dismissal-request-data.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-dismissal-request-data-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookDependabotAlertDismissalRequestData();
    }
}
