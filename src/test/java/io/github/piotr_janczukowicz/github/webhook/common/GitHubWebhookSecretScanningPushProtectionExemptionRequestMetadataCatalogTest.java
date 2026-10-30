package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSecretScanningPushProtectionExemptionRequestMetadataCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningPushProtectionExemptionRequestMetadata.class;
    }

    @Override
    protected String fixture() {
        return "webhook-secret-scanning-push-protection-exemption-request-metadata.json";
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-push-protection-exemption-request-metadata-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookSecretScanningPushProtectionExemptionRequestMetadata();
    }
}
