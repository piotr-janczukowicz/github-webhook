package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookExemptionRequestRequestTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookExemptionRequestRequestType.class;
    }

    @Override
    protected String schema() {
        return "webhook-exemption-request-request-type-schema.json";
    }
}
