package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueCommentPinnedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueCommentPinnedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-comment-pinned-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-comment-pinned-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueCommentCatalogFixtures.webhookIssueCommentPinnedEvent();
    }
}
