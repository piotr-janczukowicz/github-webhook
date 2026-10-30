package io.github.piotr_janczukowicz.github.webhook.milestone;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookMilestoneEditedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookMilestoneEditedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-milestone-edited-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-milestone-edited-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return MilestoneCatalogFixtures.webhookMilestoneEditedChanges();
    }
}
