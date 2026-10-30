package io.github.piotr_janczukowicz.github.webhook.team;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookTeamRemovedFromRepositoryEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTeamRemovedFromRepositoryEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-team-removed-from-repository-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-team-removed-from-repository-event-schema.json";
    }

    @Override
    protected Object expected() {
        return TeamCatalogFixtures.webhookTeamRemovedFromRepositoryEvent();
    }
}
