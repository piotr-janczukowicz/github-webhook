package io.github.piotr_janczukowicz.github.webhook.issues;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookIssuesOpenedChangesOldRepositoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookIssuesOpenedChangesOldRepository.class;
    }

    @Override
    protected String fixture() {
        return "webhook-issues-opened-changes-old-repository.json";
    }

    @Override
    protected String schema() {
        return "webhook-issues-opened-changes-old-repository-schema.json";
    }

    @Override
    protected Object expected() {
        return IssuesCatalogFixtures.webhookIssuesOpenedChangesOldRepository();
    }
}
