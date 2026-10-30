package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookSecretScanningPushProtectionExemptionRequestMetadataReasonCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningPushProtectionExemptionRequestMetadataReason.class;
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-push-protection-exemption-request-metadata-reason-schema.json";
    }
}
