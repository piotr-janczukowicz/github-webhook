package io.github.piotr_janczukowicz.github.webhook.secretscanningscan;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookSecretScanningScanCompletedTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningScanCompletedType.class;
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-scan-completed-type-schema.json";
    }
}
