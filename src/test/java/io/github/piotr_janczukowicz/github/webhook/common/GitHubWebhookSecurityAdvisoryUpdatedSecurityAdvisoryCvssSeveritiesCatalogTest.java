package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities.class;
    }

    @Override
    protected String fixture() {
        return "webhook-security-advisory-updated-security-advisory-cvss-severities.json";
    }

    @Override
    protected String schema() {
        return "webhook-security-advisory-updated-security-advisory-cvss-severities-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeverities();
    }
}
