package io.github.piotr_janczukowicz.github.webhook.commitcomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookCommitCommentCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookCommitCommentCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-commit-comment-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-commit-comment-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return CommitCommentCatalogFixtures.webhookCommitCommentCreatedEvent();
    }
}
