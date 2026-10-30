package io.github.piotr_janczukowicz.github.webhook.exemptionrequestpushruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookExemptionRequestPushRulesetCancelledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookExemptionRequestPushRulesetCancelledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-exemption-request-push-ruleset-cancelled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-exemption-request-push-ruleset-cancelled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ExemptionRequestPushRulesetCatalogFixtures.webhookExemptionRequestPushRulesetCancelledEvent();
    }
}
