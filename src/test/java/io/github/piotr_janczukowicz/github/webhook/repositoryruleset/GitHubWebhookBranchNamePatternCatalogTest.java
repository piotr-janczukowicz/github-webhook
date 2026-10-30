package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookBranchNamePatternCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookBranchNamePattern.class;
    }

    @Override
    protected String fixture() {
        return "webhook-branch-name-pattern.json";
    }

    @Override
    protected String schema() {
        return "webhook-branch-name-pattern-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookBranchNamePattern();
    }
}
