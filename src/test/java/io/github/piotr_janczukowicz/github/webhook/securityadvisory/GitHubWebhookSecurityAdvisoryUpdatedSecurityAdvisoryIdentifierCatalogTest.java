package io.github.piotr_janczukowicz.github.webhook.securityadvisory;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryIdentifierCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryIdentifier.class;
    }

    @Override
    protected String fixture() {
        return "webhook-security-advisory-updated-security-advisory-identifier.json";
    }

    @Override
    protected String schema() {
        return "webhook-security-advisory-updated-security-advisory-identifier-schema.json";
    }

    @Override
    protected Object expected() {
        return SecurityAdvisoryCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisoryIdentifier();
    }
}
