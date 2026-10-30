package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookExemptionRequestStatusCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookExemptionRequestStatus.class;
    }

    @Override
    protected String schema() {
        return "webhook-exemption-request-status-schema.json";
    }
}
