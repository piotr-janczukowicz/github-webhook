package io.github.piotr_janczukowicz.github.webhook.workflowjob;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowJobCompletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowJobCompletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-job-completed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-job-completed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowJobCatalogFixtures.webhookWorkflowJobCompletedEvent();
    }
}
