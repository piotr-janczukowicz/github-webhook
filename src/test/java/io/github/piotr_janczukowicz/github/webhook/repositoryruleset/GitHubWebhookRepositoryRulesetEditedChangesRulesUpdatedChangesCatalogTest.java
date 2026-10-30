package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetEditedChangesRulesUpdatedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetEditedChangesRulesUpdatedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-edited-changes-rules-updated-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-edited-changes-rules-updated-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetEditedChangesRulesUpdatedChanges();
    }
}
