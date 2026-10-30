package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdatedCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetEditedChangesConditionsUpdated.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-edited-changes-conditions-updated.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-edited-changes-conditions-updated-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetEditedChangesConditionsUpdated();
    }
}
