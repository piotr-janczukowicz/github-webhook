package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookTeamSimpleCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookTeamSimple.class;
    }

    @Override
    protected String fixture() {
        return "webhook-team-simple.json";
    }

    @Override
    protected String schema() {
        return "webhook-team-simple-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookTeamSimple();
    }
}
