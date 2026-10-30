package io.github.piotr_janczukowicz.github.webhook.pullrequest;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeamCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestLockedPullRequestRequestedReviewersTeam.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-locked-pull-request-requested-reviewers-team.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-locked-pull-request-requested-reviewers-team-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestCatalogFixtures.webhookPullRequestLockedPullRequestRequestedReviewersTeam();
    }
}
