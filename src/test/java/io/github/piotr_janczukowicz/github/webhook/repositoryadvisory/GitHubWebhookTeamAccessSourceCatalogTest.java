package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookTeamAccessSourceCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTeamAccessSource.class;
    }

    @Override
    protected String schema() {
        return "webhook-team-access-source-schema.json";
    }
}
