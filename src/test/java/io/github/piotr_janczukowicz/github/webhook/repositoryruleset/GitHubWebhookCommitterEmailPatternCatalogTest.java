package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCommitterEmailPatternCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCommitterEmailPattern.class;
    }

    @Override
    protected String fixture() {
        return "webhook-committer-email-pattern.json";
    }

    @Override
    protected String schema() {
        return "webhook-committer-email-pattern-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookCommitterEmailPattern();
    }
}
