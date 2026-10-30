package io.github.piotr_janczukowicz.github.webhook.status;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookStatusCommitValueVerificationReasonCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookStatusCommitValueVerificationReason.class;
    }

    @Override
    protected String schema() {
        return "webhook-status-commit-value-verification-reason-schema.json";
    }
}
