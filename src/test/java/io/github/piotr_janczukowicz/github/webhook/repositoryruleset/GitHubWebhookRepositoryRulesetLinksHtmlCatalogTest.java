package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookRepositoryRulesetLinksHtmlCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetLinksHtml.class;
    }

    @Override
    protected String fixture() {
        return "webhook-repository-ruleset-links-html.json";
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-links-html-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookRepositoryRulesetLinksHtml();
    }
}
