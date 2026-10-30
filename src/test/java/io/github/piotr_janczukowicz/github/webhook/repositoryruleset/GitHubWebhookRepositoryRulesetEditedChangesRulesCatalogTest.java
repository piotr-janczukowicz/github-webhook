package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetEditedChangesRulesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetEditedChangesRules.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-edited-changes-rules.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-edited-changes-rules-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetEditedChangesRules();
    }
}
