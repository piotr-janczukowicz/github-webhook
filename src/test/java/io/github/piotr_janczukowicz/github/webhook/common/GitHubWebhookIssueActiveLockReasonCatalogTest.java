package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookIssueActiveLockReasonCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueActiveLockReason.class;
    }

    @Override
    protected String schema() {
        return "webhook-issue-active-lock-reason-schema.json";
    }
}
