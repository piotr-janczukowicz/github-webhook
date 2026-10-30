package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookLicenseComplianceAlertClosureRequestDataTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookLicenseComplianceAlertClosureRequestDataType.class;
    }

    @Override
    protected String schema() {
        return "webhook-license-compliance-alert-closure-request-data-type-schema.json";
    }
}
