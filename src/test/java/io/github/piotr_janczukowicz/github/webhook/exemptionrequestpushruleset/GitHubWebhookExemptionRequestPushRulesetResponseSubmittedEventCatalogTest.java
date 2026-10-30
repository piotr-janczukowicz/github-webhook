package io.github.piotr_janczukowicz.github.webhook.exemptionrequestpushruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookExemptionRequestPushRulesetResponseSubmittedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookExemptionRequestPushRulesetResponseSubmittedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-exemption-request-push-ruleset-response-submitted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-exemption-request-push-ruleset-response-submitted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ExemptionRequestPushRulesetCatalogFixtures.webhookExemptionRequestPushRulesetResponseSubmittedEvent();
    }
}
