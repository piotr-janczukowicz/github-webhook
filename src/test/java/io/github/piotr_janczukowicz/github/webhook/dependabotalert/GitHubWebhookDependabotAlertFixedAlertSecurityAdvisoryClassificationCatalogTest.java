package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryClassificationCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryClassification.class;
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-fixed-alert-security-advisory-classification-schema.json";
    }
}
