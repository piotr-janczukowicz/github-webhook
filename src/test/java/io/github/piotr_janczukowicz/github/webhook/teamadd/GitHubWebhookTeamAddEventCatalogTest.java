package io.github.piotr_janczukowicz.github.webhook.teamadd;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookTeamAddEventCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTeamAddEvent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-team-add-event.json";
    }

    @Override
    protected String schema() {
        return "webhook-team-add-event-schema.json";
    }

    @Override
    protected Object expected() {
        return TeamAddCatalogFixtures.webhookTeamAddEvent();
    }
}
