package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssueCommentEditedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueCommentEditedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issue-comment-edited-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-issue-comment-edited-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookIssueCommentEditedChanges();
    }
}
