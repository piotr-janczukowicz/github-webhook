package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookDeploymentWorkflowRunStatusCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentWorkflowRunStatus.class;
    }

    @Override
    protected String schema() {
        return "webhook-deployment-workflow-run-status-schema.json";
    }
}
