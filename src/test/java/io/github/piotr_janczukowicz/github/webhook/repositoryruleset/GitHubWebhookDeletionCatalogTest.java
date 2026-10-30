package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeletionCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeletion.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deletion.json";
    }

    @Override
    protected String schema() {
        return "webhook-deletion-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookDeletion();
    }
}
