package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookFileExtensionRestrictionParametersCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookFileExtensionRestrictionParameters.class;
    }

    @Override
    protected String fixture() {
        return "webhook-file-extension-restriction-parameters.json";
    }

    @Override
    protected String schema() {
        return "webhook-file-extension-restriction-parameters-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookFileExtensionRestrictionParameters();
    }
}
