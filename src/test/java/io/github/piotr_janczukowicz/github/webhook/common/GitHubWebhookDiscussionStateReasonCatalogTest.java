package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookDiscussionStateReasonCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDiscussionStateReason.class;
    }

    @Override
    protected String schema() {
        return "webhook-discussion-state-reason-schema.json";
    }
}
