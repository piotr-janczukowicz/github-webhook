package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetCreatedEvent();
    }
}
