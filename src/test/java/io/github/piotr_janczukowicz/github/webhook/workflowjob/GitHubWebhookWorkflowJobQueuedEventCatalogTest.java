package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowJobQueuedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowJobQueuedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-job-queued-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-job-queued-event-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowJobCatalogFixtures.webhookWorkflowJobQueuedEvent();
    }
}
