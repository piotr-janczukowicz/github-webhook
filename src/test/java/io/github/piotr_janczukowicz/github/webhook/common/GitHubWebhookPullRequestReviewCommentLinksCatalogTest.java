package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewCommentLinksCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewCommentLinks.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-comment-links.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-comment-links-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookPullRequestReviewCommentLinks();
    }
}
