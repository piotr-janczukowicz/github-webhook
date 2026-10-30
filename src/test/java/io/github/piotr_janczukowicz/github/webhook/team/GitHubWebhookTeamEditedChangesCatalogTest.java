package io.github.piotr_janczukowicz.github.webhook.team;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookTeamEditedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTeamEditedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-team-edited-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-team-edited-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return TeamCatalogFixtures.webhookTeamEditedChanges();
    }
}
