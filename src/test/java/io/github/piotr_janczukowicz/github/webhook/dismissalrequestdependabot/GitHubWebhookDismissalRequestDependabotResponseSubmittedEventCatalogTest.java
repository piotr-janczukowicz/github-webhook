package io.github.piotr_janczukowicz.github.webhook.dismissalrequestdependabot;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDismissalRequestDependabotResponseSubmittedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDismissalRequestDependabotResponseSubmittedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dismissal-request-dependabot-response-submitted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dismissal-request-dependabot-response-submitted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DismissalRequestDependabotCatalogFixtures.webhookDismissalRequestDependabotResponseSubmittedEvent();
    }
}
