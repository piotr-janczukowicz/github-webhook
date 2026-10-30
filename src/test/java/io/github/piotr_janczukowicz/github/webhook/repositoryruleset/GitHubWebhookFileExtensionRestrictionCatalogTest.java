package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookFileExtensionRestrictionCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookFileExtensionRestriction.class;
    }

    @Override
    protected String fixture() {
        return "webhook-file-extension-restriction.json";
    }

    @Override
    protected String schema() {
        return "webhook-file-extension-restriction-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookFileExtensionRestriction();
    }
}
