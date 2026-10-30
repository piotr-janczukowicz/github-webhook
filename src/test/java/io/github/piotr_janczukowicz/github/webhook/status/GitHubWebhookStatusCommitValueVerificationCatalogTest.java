package io.github.piotr_janczukowicz.github.webhook.status;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookStatusCommitValueVerificationCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookStatusCommitValueVerification.class;
    }

    @Override
    protected String fixture() {
        return "webhook-status-commit-value-verification.json";
    }

    @Override
    protected String schema() {
        return "webhook-status-commit-value-verification-schema.json";
    }

    @Override
    protected Object expected() {
        return StatusCatalogFixtures.webhookStatusCommitValueVerification();
    }
}
