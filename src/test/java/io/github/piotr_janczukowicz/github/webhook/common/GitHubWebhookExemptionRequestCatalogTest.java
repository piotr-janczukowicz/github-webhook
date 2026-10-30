package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookExemptionRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookExemptionRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-exemption-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-exemption-request-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookExemptionRequest();
    }
}
