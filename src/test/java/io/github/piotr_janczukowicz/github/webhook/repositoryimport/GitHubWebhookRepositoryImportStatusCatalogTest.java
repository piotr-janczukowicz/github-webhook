package io.github.piotr_janczukowicz.github.webhook.repositoryimport;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookRepositoryImportStatusCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookRepositoryImportStatus.class;
    }

    @Override
    protected String schema() {
        return "webhook-repository-import-status-schema.json";
    }
}
