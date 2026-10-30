package io.github.piotr_janczukowicz.github.webhook.milestone;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMilestoneCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMilestone.class;
    }

    @Override
    protected String fixture() {
        return "webhook-milestone.json";
    }

    @Override
    protected String schema() {
        return "webhook-milestone-schema.json";
    }

    @Override
    protected Object expected() {
        return MilestoneCatalogFixtures.webhookMilestone();
    }
}
