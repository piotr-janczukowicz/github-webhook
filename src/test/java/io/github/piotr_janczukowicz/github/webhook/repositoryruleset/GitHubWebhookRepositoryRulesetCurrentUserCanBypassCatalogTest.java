package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRepositoryRulesetCurrentUserCanBypassCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryRulesetCurrentUserCanBypass.class;
    }

    @Override
    protected String schema() {
        return "webhook-repository-ruleset-current-user-can-bypass-schema.json";
    }
}
