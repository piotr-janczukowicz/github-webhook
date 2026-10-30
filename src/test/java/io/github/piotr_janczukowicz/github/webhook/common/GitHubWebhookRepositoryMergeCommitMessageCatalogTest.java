package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRepositoryMergeCommitMessageCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryMergeCommitMessage.class;
    }

    @Override
    protected String schema() {
        return "webhook-repository-merge-commit-message-schema.json";
    }
}
