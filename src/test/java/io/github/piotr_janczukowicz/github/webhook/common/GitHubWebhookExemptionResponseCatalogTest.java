package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookExemptionResponseCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookExemptionResponse.class;
    }

    @Override
    protected String fixture() {
        return "webhook-exemption-response.json";
    }

    @Override
    protected String schema() {
        return "webhook-exemption-response-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookExemptionResponse();
    }
}
