package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSimplePullRequestRequestedTeamCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSimplePullRequestRequestedTeam.class;
    }

    @Override
    protected String fixture() {
        return "webhook-simple-pull-request-requested-team.json";
    }

    @Override
    protected String schema() {
        return "webhook-simple-pull-request-requested-team-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCatalogFixtures.webhookSimplePullRequestRequestedTeam();
    }
}
