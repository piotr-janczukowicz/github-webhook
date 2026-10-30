package io.github.piotr_janczukowicz.github.webhook.dependabotalert;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryEpssCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDependabotAlertFixedAlertSecurityAdvisoryEpss.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dependabot-alert-fixed-alert-security-advisory-epss.json";
    }

    @Override
    protected String schema() {
        return "webhook-dependabot-alert-fixed-alert-security-advisory-epss-schema.json";
    }

    @Override
    protected Object expected() {
        return DependabotAlertCatalogFixtures.webhookDependabotAlertFixedAlertSecurityAdvisoryEpss();
    }
}
