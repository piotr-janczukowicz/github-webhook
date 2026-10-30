package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookBranchNamePatternTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookBranchNamePatternType.class;
    }

    @Override
    protected String schema() {
        return "webhook-branch-name-pattern-type-schema.json";
    }
}
