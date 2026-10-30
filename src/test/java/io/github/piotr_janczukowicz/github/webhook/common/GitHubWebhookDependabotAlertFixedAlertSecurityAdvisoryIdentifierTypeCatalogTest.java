package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifierTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifierType.class;
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-fixed-alert-security-advisory-identifier-type-schema.json";
    }
}
