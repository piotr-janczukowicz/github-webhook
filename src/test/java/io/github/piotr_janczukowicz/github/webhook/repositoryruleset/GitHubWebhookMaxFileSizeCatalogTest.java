package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMaxFileSizeCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMaxFileSize.class;
    }

    @Override
    protected String fixture() {
        return "webhook-max-file-size.json";
    }

    @Override
    protected String schema() {
        return "webhook-max-file-size-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookMaxFileSize();
    }
}
