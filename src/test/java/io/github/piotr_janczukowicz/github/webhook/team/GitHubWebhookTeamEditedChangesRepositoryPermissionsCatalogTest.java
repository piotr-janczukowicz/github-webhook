package io.github.piotr_janczukowicz.github.webhook.team;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookTeamEditedChangesRepositoryPermissionsCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTeamEditedChangesRepositoryPermissions.class;
    }

    @Override
    protected String fixture() {
        return "webhook-team-edited-changes-repository-permissions.json";
    }

    @Override
    protected String schema() {
        return "webhook-team-edited-changes-repository-permissions-schema.json";
    }

    @Override
    protected Object expected() {
        return TeamCatalogFixtures.webhookTeamEditedChangesRepositoryPermissions();
    }
}
