package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRequiredStatusChecksCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRequiredStatusChecks.class;
    }

    @Override
    protected String fixture() {
        return "webhook-required-status-checks.json";
    }

    @Override
    protected String schema() {
        return "webhook-required-status-checks-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRequiredStatusChecks();
    }
}
