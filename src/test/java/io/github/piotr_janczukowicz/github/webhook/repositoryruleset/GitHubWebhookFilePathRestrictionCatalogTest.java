package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookFilePathRestrictionCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookFilePathRestriction.class;
    }

    @Override
    protected String fixture() {
        return "webhook-file-path-restriction.json";
    }

    @Override
    protected String schema() {
        return "webhook-file-path-restriction-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookFilePathRestriction();
    }
}
