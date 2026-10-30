package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCweCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryCwe.class;
    }

    @Override
    protected String fixture() {
        return "webhook-security-advisory-updated-security-advisory-cwe.json";
    }

    @Override
    protected String schema() {
        return "webhook-security-advisory-updated-security-advisory-cwe-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisoryCwe();
    }
}
