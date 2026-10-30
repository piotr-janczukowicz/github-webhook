package io.github.piotr_janczukowicz.github.webhook.issuedependencies;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueDependenciesBlockingAddedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueDependenciesBlockingAddedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-dependencies-blocking-added-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-dependencies-blocking-added-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueDependenciesCatalogFixtures.webhookIssueDependenciesBlockingAddedEvent();
    }
}
