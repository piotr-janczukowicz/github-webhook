package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningPushProtectionExemptionRequestDataCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningPushProtectionExemptionRequestData.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-push-protection-exemption-request-data.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-push-protection-exemption-request-data-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookSecretScanningPushProtectionExemptionRequestData();
    }
}
