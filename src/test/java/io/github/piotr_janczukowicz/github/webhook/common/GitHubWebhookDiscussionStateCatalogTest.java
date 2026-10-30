package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookDiscussionStateCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionState.class;
    }

    @Override
    protected String schema() {
        return "webhook-discussion-state-schema.json";
    }
}
