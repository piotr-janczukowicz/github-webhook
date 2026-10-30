package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowRunRequestedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowRunRequestedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-run-requested-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-run-requested-event-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowRunCatalogFixtures.webhookWorkflowRunRequestedEvent();
    }
}
