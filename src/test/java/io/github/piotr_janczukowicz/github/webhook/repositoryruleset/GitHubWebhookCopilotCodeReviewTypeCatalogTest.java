package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCopilotCodeReviewTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCopilotCodeReviewType.class;
    }

    @Override
    protected String schema() {
        return "webhook-copilot-code-review-type-schema.json";
    }
}
