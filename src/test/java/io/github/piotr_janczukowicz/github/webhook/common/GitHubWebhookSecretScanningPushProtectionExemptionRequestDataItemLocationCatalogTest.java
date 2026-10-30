package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningPushProtectionExemptionRequestDataItemLocationCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningPushProtectionExemptionRequestDataItemLocation.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-push-protection-exemption-request-data-item-location.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-push-protection-exemption-request-data-item-location-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookSecretScanningPushProtectionExemptionRequestDataItemLocation();
    }
}
