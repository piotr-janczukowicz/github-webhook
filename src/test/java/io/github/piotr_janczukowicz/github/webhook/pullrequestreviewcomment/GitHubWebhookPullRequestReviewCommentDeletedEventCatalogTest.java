package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewCommentDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewCommentDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-comment-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-comment-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentDeletedEvent();
    }
}
