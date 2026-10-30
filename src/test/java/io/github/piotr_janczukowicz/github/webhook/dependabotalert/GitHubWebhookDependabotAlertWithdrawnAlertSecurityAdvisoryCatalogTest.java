package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertWithdrawnAlertSecurityAdvisoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertWithdrawnAlertSecurityAdvisory.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-withdrawn-alert-security-advisory.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-withdrawn-alert-security-advisory-schema.json";
    }

    @Override
    protected Object expected() {
        return DependabotAlertCatalogFixtures.webhookDependabotAlertWithdrawnAlertSecurityAdvisory();
    }
}
