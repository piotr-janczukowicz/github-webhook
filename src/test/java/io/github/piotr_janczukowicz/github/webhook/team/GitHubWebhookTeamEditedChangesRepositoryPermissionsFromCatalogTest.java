package io.github.piotr_janczukowicz.github.webhook.team;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookTeamEditedChangesRepositoryPermissionsFromCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTeamEditedChangesRepositoryPermissionsFrom.class;
    }

    @Override
    protected String fixture() {
        return "webhook-team-edited-changes-repository-permissions-from.json";
    }

    @Override
    protected String schema() {
        return "webhook-team-edited-changes-repository-permissions-from-schema.json";
    }

    @Override
    protected Object expected() {
        return TeamCatalogFixtures.webhookTeamEditedChangesRepositoryPermissionsFrom();
    }
}
