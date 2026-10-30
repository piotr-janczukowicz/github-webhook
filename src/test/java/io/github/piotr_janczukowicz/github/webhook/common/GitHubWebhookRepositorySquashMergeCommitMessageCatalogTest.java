package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRepositorySquashMergeCommitMessageCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositorySquashMergeCommitMessage.class;
    }

    @Override
    protected String schema() {
        return "webhook-repository-squash-merge-commit-message-schema.json";
    }
}
