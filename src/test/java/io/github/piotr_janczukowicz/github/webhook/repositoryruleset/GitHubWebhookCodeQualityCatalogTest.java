package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeQualityCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeQuality.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-quality.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-quality-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookCodeQuality();
    }
}
