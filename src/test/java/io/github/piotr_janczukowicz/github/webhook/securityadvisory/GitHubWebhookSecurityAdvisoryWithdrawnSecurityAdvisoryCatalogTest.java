package io.github.piotr_janczukowicz.github.webhook.securityadvisory;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecurityAdvisoryWithdrawnSecurityAdvisory.class;
    }

    @Override
    protected String fixture() {
        return "webhook-security-advisory-withdrawn-security-advisory.json";
    }

    @Override
    protected String schema() {
        return "webhook-security-advisory-withdrawn-security-advisory-schema.json";
    }

    @Override
    protected Object expected() {
        return SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryWithdrawnSecurityAdvisory();
    }
}
