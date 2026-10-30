package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifierCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryIdentifier.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-fixed-alert-security-advisory-identifier.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-fixed-alert-security-advisory-identifier-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookDependabotAlertFixedAlertSecurityAdvisoryIdentifier();
    }
}
