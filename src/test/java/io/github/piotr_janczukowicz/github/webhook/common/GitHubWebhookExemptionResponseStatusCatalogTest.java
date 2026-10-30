package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookExemptionResponseStatusCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookExemptionResponseStatus.class;
    }

    @Override
    protected String schema() {
        return "webhook-exemption-response-status-schema.json";
    }
}
