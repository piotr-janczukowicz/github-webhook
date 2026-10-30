package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookDependabotAlertDismissalRequestDataTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertDismissalRequestDataType.class;
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-dismissal-request-data-type-schema.json";
    }
}
