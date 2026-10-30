package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetEditedChangesConditionsCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetEditedChangesConditions.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-edited-changes-conditions.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-edited-changes-conditions-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetEditedChangesConditions();
    }
}
