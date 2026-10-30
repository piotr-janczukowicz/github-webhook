package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestParametersCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestParameters.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-parameters.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-parameters-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookPullRequestParameters();
    }
}
