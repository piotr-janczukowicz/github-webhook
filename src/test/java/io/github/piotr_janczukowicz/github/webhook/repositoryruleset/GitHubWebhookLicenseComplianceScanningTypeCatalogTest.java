package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookLicenseComplianceScanningTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookLicenseComplianceScanningType.class;
    }

    @Override
    protected String schema() {
        return "webhook-license-compliance-scanning-type-schema.json";
    }
}
