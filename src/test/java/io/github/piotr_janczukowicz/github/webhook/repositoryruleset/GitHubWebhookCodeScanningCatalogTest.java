package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanning.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookCodeScanning();
    }
}
