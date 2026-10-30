package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPushRulesetBypassExemptionRequestDataCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPushRulesetBypassExemptionRequestData.class;
    }

    @Override
    protected String fixture() {
        return "webhook-push-ruleset-bypass-exemption-request-data.json";
    }

    @Override
    protected String schema() {
        return "webhook-push-ruleset-bypass-exemption-request-data-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookPushRulesetBypassExemptionRequestData();
    }
}
