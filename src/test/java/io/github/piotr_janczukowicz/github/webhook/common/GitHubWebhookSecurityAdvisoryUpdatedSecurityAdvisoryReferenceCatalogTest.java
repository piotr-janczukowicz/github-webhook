package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryReferenceCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecurityAdvisoryUpdatedSecurityAdvisoryReference.class;
    }

    @Override
    protected String fixture() {
        return "webhook-security-advisory-updated-security-advisory-reference.json";
    }

    @Override
    protected String schema() {
        return "webhook-security-advisory-updated-security-advisory-reference-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookSecurityAdvisoryUpdatedSecurityAdvisoryReference();
    }
}
