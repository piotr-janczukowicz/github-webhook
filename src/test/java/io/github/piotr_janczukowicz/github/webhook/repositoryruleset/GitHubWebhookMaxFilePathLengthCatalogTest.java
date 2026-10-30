package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMaxFilePathLengthCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMaxFilePathLength.class;
    }

    @Override
    protected String fixture() {
        return "webhook-max-file-path-length.json";
    }

    @Override
    protected String schema() {
        return "webhook-max-file-path-length-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookMaxFilePathLength();
    }
}
