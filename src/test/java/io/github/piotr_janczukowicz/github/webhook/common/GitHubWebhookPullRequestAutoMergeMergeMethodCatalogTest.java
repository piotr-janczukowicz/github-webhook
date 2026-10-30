package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookPullRequestAutoMergeMergeMethodCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestAutoMergeMergeMethod.class;
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-auto-merge-merge-method-schema.json";
    }
}
