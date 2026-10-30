package io.github.piotr_janczukowicz.github.webhook.mergegroup;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSimpleCommitCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSimpleCommit.class;
    }

    @Override
    protected String fixture() {
        return "webhook-simple-commit.json";
    }

    @Override
    protected String schema() {
        return "webhook-simple-commit-schema.json";
    }

    @Override
    protected Object expected() {
        return MergeGroupCatalogFixtures.webhookSimpleCommit();
    }
}
