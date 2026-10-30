package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowRunCompletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowRunCompletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-run-completed-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-run-completed-event-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowRunCatalogFixtures.webhookWorkflowRunCompletedEvent();
    }
}
