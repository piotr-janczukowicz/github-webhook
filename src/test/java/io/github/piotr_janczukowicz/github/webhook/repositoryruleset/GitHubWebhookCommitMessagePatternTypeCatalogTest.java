package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCommitMessagePatternTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCommitMessagePatternType.class;
    }

    @Override
    protected String schema() {
        return "webhook-commit-message-pattern-type-schema.json";
    }
}
