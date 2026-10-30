package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetEditedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetEditedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-edited-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-edited-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetEditedChanges();
    }
}
