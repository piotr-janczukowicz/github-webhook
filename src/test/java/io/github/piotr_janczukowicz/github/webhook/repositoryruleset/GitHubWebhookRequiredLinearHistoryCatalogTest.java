package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRequiredLinearHistoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRequiredLinearHistory.class;
    }

    @Override
    protected String fixture() {
        return "webhook-required-linear-history.json";
    }

    @Override
    protected String schema() {
        return "webhook-required-linear-history-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRequiredLinearHistory();
    }
}
