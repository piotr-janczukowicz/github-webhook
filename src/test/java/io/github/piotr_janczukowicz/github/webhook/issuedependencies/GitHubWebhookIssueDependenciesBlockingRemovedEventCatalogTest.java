package io.github.piotr_janczukowicz.github.webhook.issuedependencies;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueDependenciesBlockingRemovedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueDependenciesBlockingRemovedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-dependencies-blocking-removed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-dependencies-blocking-removed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueDependenciesCatalogFixtures.webhookIssueDependenciesBlockingRemovedEvent();
    }
}
