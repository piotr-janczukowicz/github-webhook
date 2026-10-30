package io.github.piotr_janczukowicz.github.webhook.issuedependencies;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueDependenciesBlockedByAddedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueDependenciesBlockedByAddedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-dependencies-blocked-by-added-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-dependencies-blocked-by-added-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueDependenciesCatalogFixtures.webhookIssueDependenciesBlockedByAddedEvent();
    }
}
