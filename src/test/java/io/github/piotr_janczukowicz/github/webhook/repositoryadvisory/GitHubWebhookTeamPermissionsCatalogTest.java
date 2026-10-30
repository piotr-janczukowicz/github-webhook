package io.github.piotr_janczukowicz.github.webhook.repositoryadvisory;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookTeamPermissionsCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTeamPermissions.class;
    }

    @Override
    protected String fixture() {
        return "webhook-team-permissions.json";
    }

    @Override
    protected String schema() {
        return "webhook-team-permissions-schema.json";
    }

    @Override
    protected Object expected() {
        return RepositoryAdvisoryCatalogFixtures.webhookTeamPermissions();
    }
}
