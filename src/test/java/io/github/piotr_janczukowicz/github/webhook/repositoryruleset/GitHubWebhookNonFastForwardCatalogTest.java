package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookNonFastForwardCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookNonFastForward.class;
    }

    @Override
    protected String fixture() {
        return "webhook-non-fast-forward.json";
    }

    @Override
    protected String schema() {
        return "webhook-non-fast-forward-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookNonFastForward();
    }
}
