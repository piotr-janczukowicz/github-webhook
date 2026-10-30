package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookLicenseComplianceScanningCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookLicenseComplianceScanning.class;
    }

    @Override
    protected String fixture() {
        return "webhook-license-compliance-scanning.json";
    }

    @Override
    protected String schema() {
        return "webhook-license-compliance-scanning-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookLicenseComplianceScanning();
    }
}
