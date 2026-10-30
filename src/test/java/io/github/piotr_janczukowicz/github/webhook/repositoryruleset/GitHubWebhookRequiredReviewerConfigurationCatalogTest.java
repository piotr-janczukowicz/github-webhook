package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRequiredReviewerConfigurationCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRequiredReviewerConfiguration.class;
    }

    @Override
    protected String fixture() {
        return "webhook-required-reviewer-configuration.json";
    }

    @Override
    protected String schema() {
        return "webhook-required-reviewer-configuration-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRequiredReviewerConfiguration();
    }
}
