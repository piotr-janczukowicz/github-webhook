package io.github.piotr_janczukowicz.github.webhook.pullrequestreview;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookPullRequestAutoMergeEnabledByCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookPullRequestAutoMergeEnabledBy.class;
    }

    @Override
    protected String fixture() {
        return "webhook-pull-request-auto-merge-enabled-by.json";
    }

    @Override
    protected String schema() {
        return "webhook-pull-request-auto-merge-enabled-by-schema.json";
    }

    @Override
    protected Object expected() {
        return PullRequestReviewCatalogFixtures.webhookPullRequestAutoMergeEnabledBy();
    }
}
