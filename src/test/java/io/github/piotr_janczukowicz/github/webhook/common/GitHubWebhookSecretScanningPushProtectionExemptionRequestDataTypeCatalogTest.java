package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookSecretScanningPushProtectionExemptionRequestDataTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningPushProtectionExemptionRequestDataType.class;
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-push-protection-exemption-request-data-type-schema.json";
    }
}
