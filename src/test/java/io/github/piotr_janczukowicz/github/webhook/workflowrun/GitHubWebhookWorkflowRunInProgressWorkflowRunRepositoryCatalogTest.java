package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowRunInProgressWorkflowRunRepositoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowRunInProgressWorkflowRunRepository.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-run-in-progress-workflow-run-repository.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-run-in-progress-workflow-run-repository-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunRepository();
    }
}
