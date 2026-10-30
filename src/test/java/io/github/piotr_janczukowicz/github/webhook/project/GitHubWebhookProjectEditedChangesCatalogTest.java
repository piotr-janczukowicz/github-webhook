package io.github.piotr_janczukowicz.github.webhook.project;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectEditedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectEditedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-edited-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-edited-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCatalogFixtures.webhookProjectEditedChanges();
    }
}
