package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookUpdateCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookUpdate.class;
    }

    @Override
    protected String fixture() {
        return "webhook-update.json";
    }

    @Override
    protected String schema() {
        return "webhook-update-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookUpdate();
    }
}
