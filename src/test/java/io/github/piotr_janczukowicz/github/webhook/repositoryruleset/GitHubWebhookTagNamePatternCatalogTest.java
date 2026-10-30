package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookTagNamePatternCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTagNamePattern.class;
    }

    @Override
    protected String fixture() {
        return "webhook-tag-name-pattern.json";
    }

    @Override
    protected String schema() {
        return "webhook-tag-name-pattern-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookTagNamePattern();
    }
}
