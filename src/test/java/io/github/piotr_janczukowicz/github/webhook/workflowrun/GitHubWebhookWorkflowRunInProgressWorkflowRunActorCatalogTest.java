package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowRunInProgressWorkflowRunActorCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowRunInProgressWorkflowRunActor.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-run-in-progress-workflow-run-actor.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-run-in-progress-workflow-run-actor-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowRunCatalogFixtures.webhookWorkflowRunInProgressWorkflowRunActor();
    }
}
