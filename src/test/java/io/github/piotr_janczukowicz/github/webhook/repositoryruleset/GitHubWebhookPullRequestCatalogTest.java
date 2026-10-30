package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookPullRequest();
    }
}
