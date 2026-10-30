package io.github.piotr_janczukowicz.github.webhook.projectcard;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectCardMovedChangesColumnIdCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectCardMovedChangesColumnId.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-card-moved-changes-column-id.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-card-moved-changes-column-id-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCardCatalogFixtures.webhookProjectCardMovedChangesColumnId();
    }
}
