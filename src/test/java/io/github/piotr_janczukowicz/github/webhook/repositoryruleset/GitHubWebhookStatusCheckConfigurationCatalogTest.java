package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookStatusCheckConfigurationCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookStatusCheckConfiguration.class;
    }

    @Override
    protected String fixture() {
        return "webhook-status-check-configuration.json";
    }

    @Override
    protected String schema() {
        return "webhook-status-check-configuration-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookStatusCheckConfiguration();
    }
}
