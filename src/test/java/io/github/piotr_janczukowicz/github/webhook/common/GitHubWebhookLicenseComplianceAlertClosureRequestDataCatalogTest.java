package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookLicenseComplianceAlertClosureRequestDataCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookLicenseComplianceAlertClosureRequestData.class;
    }

    @Override
    protected String fixture() {
        return "webhook-license-compliance-alert-closure-request-data.json";
    }

    @Override
    protected String schema() {
        return "webhook-license-compliance-alert-closure-request-data-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookLicenseComplianceAlertClosureRequestData();
    }
}
