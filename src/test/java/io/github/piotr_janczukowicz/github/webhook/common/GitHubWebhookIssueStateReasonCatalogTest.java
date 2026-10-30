package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookIssueStateReasonCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueStateReason.class;
    }

    @Override
    protected String schema() {
        return "webhook-issue-state-reason-schema.json";
    }
}
