package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookTeamCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTeam.class;
    }

    @Override
    protected String fixture() {
        return "webhook-team.json";
    }

    @Override
    protected String schema() {
        return "webhook-team-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookTeam();
    }
}
