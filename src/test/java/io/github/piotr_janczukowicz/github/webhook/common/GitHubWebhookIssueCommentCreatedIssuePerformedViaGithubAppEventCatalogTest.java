package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppEventCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueCommentCreatedIssuePerformedViaGithubAppEvent.class;
    }

    @Override
    protected String schema() {
        return "webhook-issue-comment-created-issue-performed-via-github-app-event-schema.json";
    }
}
