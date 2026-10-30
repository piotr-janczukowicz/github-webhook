package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookDeploymentStatusCreatedCheckRunStatusCatalogTest extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentStatusCreatedCheckRunStatus.class;
    }

    @Override
    protected String schema() {
        return "webhook-deployment-status-created-check-run-status-schema.json";
    }
}
