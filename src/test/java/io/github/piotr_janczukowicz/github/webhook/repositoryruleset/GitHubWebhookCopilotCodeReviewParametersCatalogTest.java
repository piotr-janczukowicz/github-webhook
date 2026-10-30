package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCopilotCodeReviewParametersCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCopilotCodeReviewParameters.class;
    }

    @Override
    protected String fixture() {
        return "webhook-copilot-code-review-parameters.json";
    }

    @Override
    protected String schema() {
        return "webhook-copilot-code-review-parameters-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookCopilotCodeReviewParameters();
    }
}
