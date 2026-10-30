package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeamCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeam.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-comment-created-pull-request-requested-reviewers-team.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-comment-created-pull-request-requested-reviewers-team-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCommentCatalogFixtures
                .webhookPullRequestReviewCommentCreatedPullRequestRequestedReviewersTeam();
    }
}
