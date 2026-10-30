package io.github.piotr_janczukowicz.github.webhook.team;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookTeamCreatedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTeamCreatedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-team-created-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-team-created-event-schema.json";
    }

    @Override
    protected Object expected() {
        return TeamCatalogFixtures.webhookTeamCreatedEvent();
    }
}
