package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPushRulesetBypassExemptionRequestDataItemCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPushRulesetBypassExemptionRequestDataItem.class;
    }

    @Override
    protected String fixture() {
        return "webhook-push-ruleset-bypass-exemption-request-data-item.json";
    }

    @Override
    protected String schema() {
        return "webhook-push-ruleset-bypass-exemption-request-data-item-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookPushRulesetBypassExemptionRequestDataItem();
    }
}
