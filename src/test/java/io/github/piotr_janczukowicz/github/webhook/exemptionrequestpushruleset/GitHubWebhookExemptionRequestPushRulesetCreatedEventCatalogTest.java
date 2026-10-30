package io.github.piotr_janczukowicz.github.webhook.exemptionrequestpushruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookExemptionRequestPushRulesetCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookExemptionRequestPushRulesetCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-exemption-request-push-ruleset-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-exemption-request-push-ruleset-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ExemptionRequestPushRulesetCatalogFixtures.webhookExemptionRequestPushRulesetCreatedEvent();
    }
}
