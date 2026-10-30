package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetDeletedEvent();
    }
}
