package io.github.piotr_janczukowicz.github.webhook.repositoryruleset;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowFileReferenceCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowFileReference.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-file-reference.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-file-reference-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryRulesetCatalogFixtures.webhookWorkflowFileReference();
    }
}
