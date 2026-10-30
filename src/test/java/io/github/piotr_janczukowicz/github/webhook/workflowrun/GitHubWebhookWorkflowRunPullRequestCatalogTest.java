package io.github.piotr_janczukowicz.github.webhook.workflowrun;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookWorkflowRunPullRequestCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookWorkflowRunPullRequest.class;
    }

    @Override
    protected String fixture() {
        return "webhook-workflow-run-pull-request.json";
    }

    @Override
    protected String schema() {
        return "webhook-workflow-run-pull-request-schema.json";
    }

    @Override
    protected Object expected() {
        return WorkflowRunCatalogFixtures.webhookWorkflowRunPullRequest();
    }
}
