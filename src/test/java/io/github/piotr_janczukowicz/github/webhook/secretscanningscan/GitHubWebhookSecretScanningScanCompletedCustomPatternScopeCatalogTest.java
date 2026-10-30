package io.github.piotr_janczukowicz.github.webhook.secretscanningscan;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookSecretScanningScanCompletedCustomPatternScopeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSecretScanningScanCompletedCustomPatternScope.class;
    }

    @Override
    protected String schema() {
        return "webhook-secret-scanning-scan-completed-custom-pattern-scope-schema.json";
    }
}
