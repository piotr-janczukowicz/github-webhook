package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewEditedPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewEditedPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-edited-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-edited-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedPullRequest();
    }
}
