package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesCvssV3CatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesCvssV3.class;
    }

    @Override
    protected String fixture() {
        return "webhook-security-advisory-updated-security-advisory-cvss-severities-cvss-v3.json";
    }

    @Override
    protected String schema() {
        return "webhook-security-advisory-updated-security-advisory-cvss-severities-cvss-v3-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisoryCvssSeveritiesCvssV3();
    }
}
