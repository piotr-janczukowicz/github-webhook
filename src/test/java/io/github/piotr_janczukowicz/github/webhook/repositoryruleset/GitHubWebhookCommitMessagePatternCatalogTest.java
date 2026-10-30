package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCommitMessagePatternCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCommitMessagePattern.class;
    }

    @Override
    protected String fixture() {
        return "webhook-commit-message-pattern.json";
    }

    @Override
    protected String schema() {
        return "webhook-commit-message-pattern-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookCommitMessagePattern();
    }
}
