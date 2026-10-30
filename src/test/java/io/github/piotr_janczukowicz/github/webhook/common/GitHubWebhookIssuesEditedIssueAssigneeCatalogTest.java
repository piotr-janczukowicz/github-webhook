package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesEditedIssueAssigneeCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesEditedIssueAssignee.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-edited-issue-assignee.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-edited-issue-assignee-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookIssuesEditedIssueAssignee();
    }
}
