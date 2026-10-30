package io.github.piotr_janczukowicz.github.webhook.issuecomment;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueCommentUnpinnedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueCommentUnpinnedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-comment-unpinned-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-comment-unpinned-event-schema.json";
    }

    @Override
    protected Object expected() {
        return IssueCommentCatalogFixtures.webhookIssueCommentUnpinnedEvent();
    }
}
