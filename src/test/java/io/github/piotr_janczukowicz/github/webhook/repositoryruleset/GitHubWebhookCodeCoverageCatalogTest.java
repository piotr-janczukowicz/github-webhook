package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeCoverageCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeCoverage.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-coverage.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-coverage-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookCodeCoverage();
    }
}
