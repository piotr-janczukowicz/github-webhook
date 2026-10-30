package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCodeScanningToolCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCodeScanningTool.class;
    }

    @Override
    protected String fixture() {
        return "webhook-code-scanning-tool.json";
    }

    @Override
    protected String schema() {
        return "webhook-code-scanning-tool-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookCodeScanningTool();
    }
}
