package io.github.piotr_janczukowicz.github.webhook.team;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookTeamEditedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTeamEditedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-team-edited-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-team-edited-event-schema.json";
    }

    @Override
    protected Object expected() {
        return TeamCatalogFixtures.webhookTeamEditedEvent();
    }
}
