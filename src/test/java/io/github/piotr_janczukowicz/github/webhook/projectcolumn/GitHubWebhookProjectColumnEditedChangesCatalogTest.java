package io.github.piotr_janczukowicz.github.webhook.projectcolumn;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectColumnEditedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectColumnEditedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-column-edited-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-column-edited-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectColumnCatalogFixtures.webhookProjectColumnEditedChanges();
    }
}
