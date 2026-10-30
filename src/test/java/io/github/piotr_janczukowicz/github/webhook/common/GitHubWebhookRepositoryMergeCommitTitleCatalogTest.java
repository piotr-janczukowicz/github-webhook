package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRepositoryMergeCommitTitleCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryMergeCommitTitle.class;
    }

    @Override
    protected String schema() {
        return "webhook-repository-merge-commit-title-schema.json";
    }
}
