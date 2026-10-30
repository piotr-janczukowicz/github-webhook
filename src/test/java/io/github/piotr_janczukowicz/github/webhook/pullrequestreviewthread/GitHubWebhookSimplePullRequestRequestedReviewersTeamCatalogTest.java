package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewthread;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSimplePullRequestRequestedReviewersTeamCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSimplePullRequestRequestedReviewersTeam.class;
    }

    @Override
    protected String fixture() {
        return "webhook-simple-pull-request-requested-reviewers-team.json";
    }

    @Override
    protected String schema() {
        return "webhook-simple-pull-request-requested-reviewers-team-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewThreadCatalogFixtures.webhookSimplePullRequestRequestedReviewersTeam();
    }
}
