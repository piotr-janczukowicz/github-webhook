package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentStatusCreatedDeploymentStatusCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentStatusCreatedDeploymentStatus.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-status-created-deployment-status.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-status-created-deployment-status-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedDeploymentStatus();
    }
}
