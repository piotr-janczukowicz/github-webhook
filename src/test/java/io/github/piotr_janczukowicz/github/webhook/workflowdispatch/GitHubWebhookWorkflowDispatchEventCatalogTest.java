package io.github.piotr_janczukowicz.github.webhook.workflowdispatch;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowDispatchEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowDispatchEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-dispatch-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-dispatch-event-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowDispatchCatalogFixtures.webhookWorkflowDispatchEvent();
    }
}
