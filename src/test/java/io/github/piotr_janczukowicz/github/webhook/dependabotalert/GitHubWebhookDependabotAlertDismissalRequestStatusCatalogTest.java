package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookDependabotAlertDismissalRequestStatusCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertDismissalRequestStatus.class;
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-dismissal-request-status-schema.json";
    }
}
