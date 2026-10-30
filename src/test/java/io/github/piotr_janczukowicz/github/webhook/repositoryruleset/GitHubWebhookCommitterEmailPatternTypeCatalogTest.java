package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCommitterEmailPatternTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCommitterEmailPatternType.class;
    }

    @Override
    protected String schema() {
        return "webhook-committer-email-pattern-type-schema.json";
    }
}
