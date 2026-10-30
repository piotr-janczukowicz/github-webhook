package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertFixedAlertSecurityAdvisory.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-fixed-alert-security-advisory.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-fixed-alert-security-advisory-schema.json";
    }

    @Override
    protected Object expected() {
        return DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlertSecurityAdvisory();
    }
}
