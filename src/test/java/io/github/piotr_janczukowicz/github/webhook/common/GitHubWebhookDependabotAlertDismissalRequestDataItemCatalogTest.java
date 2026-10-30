package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertDismissalRequestDataItemCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertDismissalRequestDataItem.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-dismissal-request-data-item.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-dismissal-request-data-item-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookDependabotAlertDismissalRequestDataItem();
    }
}
