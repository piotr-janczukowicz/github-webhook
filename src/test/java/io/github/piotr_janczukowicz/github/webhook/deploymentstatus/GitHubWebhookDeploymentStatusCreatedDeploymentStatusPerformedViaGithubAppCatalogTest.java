package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubAppCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubApp.class;
    }

    @Override
    protected String fixture() {
        return "webhook-deployment-status-created-deployment-status-performed-via-github-app.json";
    }

    @Override
    protected String schema() {
        return "webhook-deployment-status-created-deployment-status-performed-via-github-app-schema.json";
    }

    @Override
    protected Object expected() {
        return DeploymentStatusCatalogFixtures.webhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubApp();
    }
}
