package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCopilotCodeReviewCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCopilotCodeReview.class;
    }

    @Override
    protected String fixture() {
        return "webhook-copilot-code-review.json";
    }

    @Override
    protected String schema() {
        return "webhook-copilot-code-review-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookCopilotCodeReview();
    }
}
