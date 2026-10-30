package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookCommitAuthorEmailPatternTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCommitAuthorEmailPatternType.class;
    }

    @Override
    protected String schema() {
        return "webhook-commit-author-email-pattern-type-schema.json";
    }
}
