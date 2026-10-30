package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookFilePathRestrictionParametersCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookFilePathRestrictionParameters.class;
    }

    @Override
    protected String fixture() {
        return "webhook-file-path-restriction-parameters.json";
    }

    @Override
    protected String schema() {
        return "webhook-file-path-restriction-parameters-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookFilePathRestrictionParameters();
    }
}
