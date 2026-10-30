package io.github.piotr_janczukowicz.github.webhook.exemptionrequestpushruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookExemptionRequestPushRulesetResponseDismissedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookExemptionRequestPushRulesetResponseDismissedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-exemption-request-push-ruleset-response-dismissed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-exemption-request-push-ruleset-response-dismissed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ExemptionRequestPushRulesetCatalogFixtures.webhookExemptionRequestPushRulesetResponseDismissedEvent();
    }
}
