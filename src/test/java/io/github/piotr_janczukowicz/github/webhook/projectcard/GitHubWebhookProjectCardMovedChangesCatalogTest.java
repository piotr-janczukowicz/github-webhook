package io.github.piotr_janczukowicz.github.webhook.projectcard;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectCardMovedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectCardMovedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-card-moved-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-card-moved-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCardCatalogFixtures.webhookProjectCardMovedChanges();
    }
}
