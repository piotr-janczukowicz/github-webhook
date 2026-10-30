package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookPullRequestDequeuedReasonCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestDequeuedReason.class;
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-dequeued-reason-schema.json";
    }
}
