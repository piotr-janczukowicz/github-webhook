package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetEditedChangesRulesUpdatedCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetEditedChangesRulesUpdated.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-edited-changes-rules-updated.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-edited-changes-rules-updated-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetEditedChangesRulesUpdated();
    }
}
