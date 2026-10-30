package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewCommentCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewCommentCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-comment-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-comment-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCommentCatalogFixtures.webhookPullRequestReviewCommentCreatedEvent();
    }
}
