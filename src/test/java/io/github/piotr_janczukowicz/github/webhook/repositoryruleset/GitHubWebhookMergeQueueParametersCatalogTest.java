package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMergeQueueParametersCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMergeQueueParameters.class;
    }

    @Override
    protected String fixture() {
        return "webhook-merge-queue-parameters.json";
    }

    @Override
    protected String schema() {
        return "webhook-merge-queue-parameters-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookMergeQueueParameters();
    }
}
