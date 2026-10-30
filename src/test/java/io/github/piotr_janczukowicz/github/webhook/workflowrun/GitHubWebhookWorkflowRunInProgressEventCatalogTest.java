package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowRunInProgressEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowRunInProgressEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-run-in-progress-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-run-in-progress-event-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressEvent();
    }
}
