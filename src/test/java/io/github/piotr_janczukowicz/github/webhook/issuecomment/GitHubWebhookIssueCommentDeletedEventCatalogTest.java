package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueCommentDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueCommentDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-comment-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-comment-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueCommentCatalogFixtures.webhookIssueCommentDeletedEvent();
    }
}
