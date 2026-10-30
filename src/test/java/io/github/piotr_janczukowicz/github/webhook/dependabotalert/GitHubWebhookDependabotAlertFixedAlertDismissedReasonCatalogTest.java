package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookDependabotAlertFixedAlertDismissedReasonCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertFixedAlertDismissedReason.class;
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-fixed-alert-dismissed-reason-schema.json";
    }
}
