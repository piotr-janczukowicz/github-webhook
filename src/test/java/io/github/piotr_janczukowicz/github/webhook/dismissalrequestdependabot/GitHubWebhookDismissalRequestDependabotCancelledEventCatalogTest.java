package io.github.piotr_janczukowicz.github.webhook.dismissalrequestdependabot;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDismissalRequestDependabotCancelledEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDismissalRequestDependabotCancelledEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dismissal-request-dependabot-cancelled-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dismissal-request-dependabot-cancelled-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DismissalRequestDependabotCatalogFixtures.webhookDismissalRequestDependabotCancelledEvent();
    }
}
