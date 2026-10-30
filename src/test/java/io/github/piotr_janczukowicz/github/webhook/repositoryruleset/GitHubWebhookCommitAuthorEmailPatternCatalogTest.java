package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCommitAuthorEmailPatternCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCommitAuthorEmailPattern.class;
    }

    @Override
    protected String fixture() {
        return "webhook-commit-author-email-pattern.json";
    }

    @Override
    protected String schema() {
        return "webhook-commit-author-email-pattern-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookCommitAuthorEmailPattern();
    }
}
