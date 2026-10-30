package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepositoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowRunInProgressWorkflowRunHeadRepository.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-run-in-progress-workflow-run-head-repository.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-run-in-progress-workflow-run-head-repository-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunHeadRepository();
    }
}
