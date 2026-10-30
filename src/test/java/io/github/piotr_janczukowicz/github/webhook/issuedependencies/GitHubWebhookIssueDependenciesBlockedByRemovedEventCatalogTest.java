package io.github.piotr_janczukowicz.github.webhook.issuedependencies;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueDependenciesBlockedByRemovedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueDependenciesBlockedByRemovedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-dependencies-blocked-by-removed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-dependencies-blocked-by-removed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueDependenciesCatalogFixtures.webhookIssueDependenciesBlockedByRemovedEvent();
    }
}
