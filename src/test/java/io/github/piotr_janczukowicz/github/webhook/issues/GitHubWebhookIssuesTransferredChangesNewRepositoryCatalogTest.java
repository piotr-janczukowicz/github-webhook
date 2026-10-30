package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesTransferredChangesNewRepositoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesTransferredChangesNewRepository.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-transferred-changes-new-repository.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-transferred-changes-new-repository-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesTransferredChangesNewRepository();
    }
}
