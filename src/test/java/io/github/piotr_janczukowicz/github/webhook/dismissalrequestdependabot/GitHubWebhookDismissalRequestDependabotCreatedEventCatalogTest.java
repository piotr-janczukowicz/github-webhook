package io.github.piotr_janczukowicz.github.webhook.dismissalrequestdependabot;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDismissalRequestDependabotCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDismissalRequestDependabotCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-dismissal-request-dependabot-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-dismissal-request-dependabot-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return DismissalRequestDependabotCatalogFixtures.webhookDismissalRequestDependabotCreatedEvent();
    }
}
