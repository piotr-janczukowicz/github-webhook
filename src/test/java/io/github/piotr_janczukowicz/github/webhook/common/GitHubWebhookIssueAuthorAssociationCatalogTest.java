package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookIssueAuthorAssociationCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssueAuthorAssociation.class;
    }

    @Override
    protected String schema() {
        return "webhook-issue-author-association-schema.json";
    }
}
