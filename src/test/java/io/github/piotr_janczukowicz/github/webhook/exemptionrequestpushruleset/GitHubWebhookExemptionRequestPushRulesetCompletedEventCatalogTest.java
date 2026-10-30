package io.github.piotr_janczukowicz.github.webhook.exemptionrequestpushruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookExemptionRequestPushRulesetCompletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookExemptionRequestPushRulesetCompletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-exemption-request-push-ruleset-completed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-exemption-request-push-ruleset-completed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return ExemptionRequestPushRulesetCatalogFixtures.webhookExemptionRequestPushRulesetCompletedEvent();
    }
}
