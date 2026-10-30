package io.github.piotr_janczukowicz.github.webhook.team;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookTeamDeletedEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTeamDeletedEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-team-deleted-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-team-deleted-event-schema.json";
    }

    @Override
    protected Object expected() {
        return TeamCatalogFixtures.webhookTeamDeletedEvent();
    }
}
