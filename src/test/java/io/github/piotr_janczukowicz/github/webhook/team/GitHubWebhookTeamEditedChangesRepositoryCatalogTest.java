package io.github.piotr_janczukowicz.github.webhook.team;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookTeamEditedChangesRepositoryCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTeamEditedChangesRepository.class;
    }

    @Override
    protected String fixture() {
        return "webhook-team-edited-changes-repository.json";
    }

    @Override
    protected String schema() {
        return "webhook-team-edited-changes-repository-schema.json";
    }

    @Override
    protected Object expected() {
        return TeamCatalogFixtures.webhookTeamEditedChangesRepository();
    }
}
