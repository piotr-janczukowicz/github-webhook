package io.github.piotr_janczukowicz.github.webhook.milestone;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMilestoneOpenedMilestoneCreatorCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMilestoneOpenedMilestoneCreator.class;
    }

    @Override
    protected String fixture() {
        return "webhook-milestone-opened-milestone-creator.json";
    }

    @Override
    protected String schema() {
        return "webhook-milestone-opened-milestone-creator-schema.json";
    }

    @Override
    protected Object expected() {
        return MilestoneCatalogFixtures.webhookMilestoneOpenedMilestoneCreator();
    }
}
