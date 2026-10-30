package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueCommentEditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueCommentEditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-comment-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-comment-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueCommentCatalogFixtures.webhookIssueCommentEditedEvent();
    }
}
