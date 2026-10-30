package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentStatusCreatedCheckRunCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentStatusCreatedCheckRun.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-status-created-check-run.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-status-created-check-run-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedCheckRun();
    }
}
