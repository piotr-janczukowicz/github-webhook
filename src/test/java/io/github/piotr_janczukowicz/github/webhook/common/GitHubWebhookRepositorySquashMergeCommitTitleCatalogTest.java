package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRepositorySquashMergeCommitTitleCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositorySquashMergeCommitTitle.class;
    }

    @Override
    protected String schema() {
        return "webhook-repository-squash-merge-commit-title-schema.json";
    }
}
