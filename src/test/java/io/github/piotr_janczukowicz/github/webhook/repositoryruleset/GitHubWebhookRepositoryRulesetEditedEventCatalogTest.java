package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetEditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetEditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetEditedEvent();
    }
}
