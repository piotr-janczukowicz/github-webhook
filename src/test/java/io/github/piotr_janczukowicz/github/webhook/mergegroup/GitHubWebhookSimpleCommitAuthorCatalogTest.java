package io.github.piotr_janczukowicz.github.webhook.mergegroup;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookSimpleCommitAuthorCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookSimpleCommitAuthor.class;
    }

    @Override
    protected String fixture() {
        return "webhook-simple-commit-author.json";
    }

    @Override
    protected String schema() {
        return "webhook-simple-commit-author-schema.json";
    }

    @Override
    protected Object expected() {
        return MergeGroupCatalogFixtures.webhookSimpleCommitAuthor();
    }
}
