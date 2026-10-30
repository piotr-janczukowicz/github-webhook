package io.github.piotr_janczukowicz.github.webhook.team;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookTeamAddedToRepositoryEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTeamAddedToRepositoryEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-team-added-to-repository-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-team-added-to-repository-event-schema.json";
    }

    @Override
    protected Object expected() {
        return TeamCatalogFixtures.webhookTeamAddedToRepositoryEvent();
    }
}
