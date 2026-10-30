package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueCommentCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueCommentCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-comment-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-comment-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueCommentCatalogFixtures.webhookIssueCommentCreatedEvent();
    }
}
