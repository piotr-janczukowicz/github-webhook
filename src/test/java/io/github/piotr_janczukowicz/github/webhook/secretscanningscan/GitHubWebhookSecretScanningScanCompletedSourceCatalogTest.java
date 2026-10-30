package io.github.piotr_janczukowicz.github.webhook.secretscanningscan;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookSecretScanningScanCompletedSourceCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningScanCompletedSource.class;
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-scan-completed-source-schema.json";
    }
}
