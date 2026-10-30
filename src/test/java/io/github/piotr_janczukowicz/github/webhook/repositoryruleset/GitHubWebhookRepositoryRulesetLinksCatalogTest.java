package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetLinksCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetLinks.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-links.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-links-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetLinks();
    }
}
