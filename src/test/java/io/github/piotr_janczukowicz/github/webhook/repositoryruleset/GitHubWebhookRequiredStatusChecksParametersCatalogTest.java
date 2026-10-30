package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRequiredStatusChecksParametersCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRequiredStatusChecksParameters.class;
    }

    @Override
    protected String fixture() {
        return "webhook-required-status-checks-parameters.json";
    }

    @Override
    protected String schema() {
        return "webhook-required-status-checks-parameters-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRequiredStatusChecksParameters();
    }
}
