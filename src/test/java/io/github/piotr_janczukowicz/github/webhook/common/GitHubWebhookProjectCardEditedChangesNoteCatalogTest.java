package io.github.piotr_janczukowicz.github.webhook.common;

import io.github.piotr_janczukowicz.github.webhook.BaseCatalogTest;

class GitHubWebhookProjectCardEditedChangesNoteCatalogTest extends BaseCatalogTest {

    @Override
    protected Class<?> type() {
        return GitHubWebhookProjectCardEditedChangesNote.class;
    }

    @Override
    protected String fixture() {
        return "webhook-project-card-edited-changes-note.json";
    }

    @Override
    protected String schema() {
        return "webhook-project-card-edited-changes-note-schema.json";
    }

    @Override
    protected Object expected() {
        return CommonCatalogFixtures.webhookProjectCardEditedChangesNote();
    }
}
