package io.github.piotr_janczukowicz.github.webhook.pullrequestreviewcomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestAutoMergeCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestAutoMerge.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-auto-merge.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-auto-merge-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCommentCatalogFixtures.webhookPullRequestAutoMerge();
    }
}
