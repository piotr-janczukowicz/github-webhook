package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRequiredSignaturesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRequiredSignatures.class;
    }

    @Override
    protected String fixture() {
        return "webhook-required-signatures.json";
    }

    @Override
    protected String schema() {
        return "webhook-required-signatures-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRequiredSignatures();
    }
}
