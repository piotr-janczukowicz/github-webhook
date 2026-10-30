package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowJobWaitingEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowJobWaitingEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-job-waiting-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-job-waiting-event-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowJobCatalogFixtures.webhookWorkflowJobWaitingEvent();
    }
}
