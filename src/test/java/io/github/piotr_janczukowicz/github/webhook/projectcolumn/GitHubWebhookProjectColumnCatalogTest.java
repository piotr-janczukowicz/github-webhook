package io.github.piotr_janczukowicz.github.webhook.projectcolumn;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectColumnCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectColumn.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-column.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-column-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectColumnCatalogFixtures.webhookProjectColumn();
    }
}
