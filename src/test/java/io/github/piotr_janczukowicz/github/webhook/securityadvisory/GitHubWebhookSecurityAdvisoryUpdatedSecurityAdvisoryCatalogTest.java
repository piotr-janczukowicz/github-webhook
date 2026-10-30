package io.github.piotr_janczukowicz.github.webhook.securityadvisory;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisory.class;
    }

    @Override
    protected String fixture() {
        return "webhook-security-advisory-updated-security-advisory.json";
    }

    @Override
    protected String schema() {
        return "webhook-security-advisory-updated-security-advisory-schema.json";
    }

    @Override
    protected Object expected() {
        return SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisory();
    }
}
