package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRepositoryPullRequestCreationPolicyCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryPullRequestCreationPolicy.class;
    }

    @Override
    protected String schema() {
        return "webhook-repository-pull-request-creation-policy-schema.json";
    }
}
