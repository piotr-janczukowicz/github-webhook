package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdatedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdatedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-edited-changes-conditions-updated-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-edited-changes-conditions-updated-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetEditedChangesConditionsUpdatedChanges();
    }
}
