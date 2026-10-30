package io.github.piotr_janczukowicz.github.webhook.milestone;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMilestoneOpenedMilestoneCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMilestoneOpenedMilestone.class;
    }

    @Override
    protected String fixture() {
        return "webhook-milestone-opened-milestone.json";
    }

    @Override
    protected String schema() {
        return "webhook-milestone-opened-milestone-schema.json";
    }

    @Override
    protected Object expected() {
        return MilestoneCatalogFixtures.webhookMilestoneOpenedMilestone();
    }
}
