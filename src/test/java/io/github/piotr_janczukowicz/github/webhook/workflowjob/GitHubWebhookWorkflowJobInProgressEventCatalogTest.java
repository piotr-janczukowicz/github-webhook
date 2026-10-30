package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowJobInProgressEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowJobInProgressEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-job-in-progress-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-job-in-progress-event-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowJobCatalogFixtures.webhookWorkflowJobInProgressEvent();
    }
}
