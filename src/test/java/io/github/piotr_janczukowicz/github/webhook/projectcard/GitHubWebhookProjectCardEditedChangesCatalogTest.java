package io.github.piotr_janczukowicz.github.webhook.projectcard;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectCardEditedChangesCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectCardEditedChanges.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-card-edited-changes.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-card-edited-changes-schema.json";
    }

    @Override
    protected Object expected() {
        return ProjectCardCatalogFixtures.webhookProjectCardEditedChanges();
    }
}
