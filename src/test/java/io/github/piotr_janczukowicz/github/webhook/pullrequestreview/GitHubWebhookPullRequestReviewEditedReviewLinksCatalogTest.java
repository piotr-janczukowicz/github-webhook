package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestReviewEditedReviewLinksCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestReviewEditedReviewLinks.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-review-edited-review-links.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-review-edited-review-links-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCatalogFixtures.webhookPullRequestReviewEditedReviewLinks();
    }
}
