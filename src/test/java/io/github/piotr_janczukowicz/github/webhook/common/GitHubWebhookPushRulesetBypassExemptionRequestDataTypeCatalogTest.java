package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookPushRulesetBypassExemptionRequestDataTypeCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPushRulesetBypassExemptionRequestDataType.class;
    }

    @Override
    protected String schema() {
        return "webhook-push-ruleset-bypass-exemption-request-data-type-schema.json";
    }
}
