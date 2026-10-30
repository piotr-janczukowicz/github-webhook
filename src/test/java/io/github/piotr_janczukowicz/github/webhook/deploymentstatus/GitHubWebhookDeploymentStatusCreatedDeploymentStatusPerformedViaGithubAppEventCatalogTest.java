package io.github.piotr_janczukowicz.github.webhook.deploymentstatus;

import io.github.piotr_janczukowicz.github.webhook.BaseEnumCatalogTest;

class GitHubWebhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubAppEventCatalogTest
        extends BaseEnumCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookDeploymentStatusCreatedDeploymentStatusPerformedViaGithubAppEvent.class;
    }

    @Override
    protected String schema() {
        return "webhook-deployment-status-created-deployment-status-performed-via-github-app-event-schema.json";
    }
}
