package io.github.piotr_janczukowicz.github.webhook.teamadd;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookTeamParentCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTeamParent.class;
    }

    @Override
    protected String fixture() {
        return "webhook-team-parent.json";
    }

    @Override
    protected String schema() {
        return "webhook-team-parent-schema.json";
    }

    @Override
    protected Object expected() {
        return TeamAddCatalogFixtures.webhookTeamParent();
    }
}
